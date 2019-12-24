package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ShowJames extends AppCompatActivity {
    Button b1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.james);

        b1 = findViewById(R.id.button_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 현재 실행 중인 Activity를 종료한다.
            }
        });
    }
}
