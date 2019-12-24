package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ShowSophia extends AppCompatActivity {
    Button b2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sophia);

        b2 = findViewById(R.id.button_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 현재 실행 중인 Activity를 종료한다.
            }
        });
    }
}
