package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyView myView = new MyView(this);
        MyListener mL = new MyListener(); // 이벤트 리스너 객체 생성하기

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setOnClickListener(mL); // 위젯에 이벤트 리스너 객체 등록하기
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "나이스 !!!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    // 인터페이스 OnClickListener를 구현한 클래스를 만든다.
    // onClick 메소드를 구현해준다.
    class MyListener implements View.OnClickListener {

        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "리스너 객체를 사용한 이벤트 처리", Toast.LENGTH_SHORT).show();
        }
    }
//    class MyView extends View {
//        MyView(Context context) {
//            super(context);
//        }
//        public boolean onTouchEvent (MotionEvent event){
//            //내부 클래스에서 MainActivity 객체를 사용하기 위해서는
//            //MainActivity.this로 사용해야 한다.
//            if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                Toast.makeText(MainActivity.this, "View touch", Toast.LENGTH_SHORT).show();
//            }
//            // 리턴값이 true이면 Activity의 onTouchEvent()가 실행되지 않는다.
//            return false;
//        }
//    }


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

//    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            Toast.makeText(this, "Activity touch", Toast.LENGTH_SHORT).show();
//        }
//        return false;
//    }
}



