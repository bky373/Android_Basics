package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ShowDrawingLots extends AppCompatActivity {
    Button b1;
    EditText ed1;
    TextView tvNumber;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawinglots);

        b1 = findViewById(R.id.button1);
        ed1 = findViewById(R.id.count);
        tvNumber = findViewById(R.id.chosenNumber);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = ed1.getText().toString().trim();
                int number = Integer.parseInt(str);
                int chosenNumber = new Random().nextInt(number) + 1;
                tvNumber.setText(String.valueOf(chosenNumber));
            }
        });

    }
}
