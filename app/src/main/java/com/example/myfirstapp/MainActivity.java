package com.example.myfirstapp;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView myView = new MyView(this);
        setContentView(myView);
    }

    class MyView extends View {
        MyView(Context context) {
            super(context);
        }
        public boolean onTouchEvent (MotionEvent event){
            //내부 클래스에서 MainActivity 객체를 사용하기 위해서는
            //MainActivity.this로 사용해야 한다.
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "View touch", Toast.LENGTH_SHORT).show();
            }
            // 리턴값이 true이면 Activity의 onTouchEvent()가 실행되지 않는다.
            return false;
        }
    }


    /**
     * Called when the user taps the Send button
     */
//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(this, "Activity touch", Toast.LENGTH_SHORT).show();
        }
        // TODO 내일 2019년 12월 19일에는 꼭 올리자
        // TODO 왜 오늘 안올렸니ㅠㅠㅠ 2019년 12월 20일 내일 꼭 올리자!
        return false;
    }
}



