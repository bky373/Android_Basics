package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    Button[] mButtons = new Button[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MyView myView = new MyView(this);

        for (int i = 0; i < 4; i++) {
            mButtons[i] = findViewById(R.id.b1 + i);
            mButtons[i].setOnClickListener(myClick); // 위젯에 이벤트 리스너 객체 등록하기
        }
    }

    // 무명 클래스를 사용해서 리스너 인터페이스를 구현함
    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.b1:
                    Toast.makeText(getApplicationContext(),
                            "구웃!!!!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.b2:
                    Toast.makeText(getApplicationContext(),
                            "사랑은 사랑을 낳는다.", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.b3:
                    Toast.makeText(getApplicationContext(),
                            "자만은 추락을 가지게 된다.", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.b4:
                    Toast.makeText(getApplicationContext(),
                            "일찍 일어나는 새가 벌레를 잡는다.", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
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


