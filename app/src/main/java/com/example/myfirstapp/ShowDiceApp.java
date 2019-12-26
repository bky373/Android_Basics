package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ShowDiceApp extends AppCompatActivity {
    private RadioGroup choiceDice;
    Button rollDice;
    RadioButton dice_one;
    // 값이 1이면 주사위 1개 선택, 2면 주사위 2개 선택
    int whichRadioButton = 2;

    ImageView mImageView1, mImageView2;
    Random r = new Random();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diceapp);

        rollDice = findViewById(R.id.button_dice_roll);
        choiceDice = findViewById(R.id.radio_dice_choice);
        dice_one = findViewById(R.id.radio_dice_one);
        mImageView1 = findViewById(R.id.dice_image_1);
        mImageView2 = findViewById(R.id.dice_image_2);
        choiceDice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_dice_one) whichRadioButton = 1;
                else if (checkedId == R.id.radio_dice_two) whichRadioButton = 2;
            }
        });

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOfDice = r.nextInt(6) + 1;;
                int numberOfDice2 = 1;

                if(whichRadioButton == 2){
                    numberOfDice2 = r.nextInt(6) + 1;
                }

                switch (numberOfDice) {
                    case 1:
                        mImageView1.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        mImageView1.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        mImageView1.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        mImageView1.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        mImageView1.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        mImageView1.setImageResource(R.drawable.dice6);
                        break;
                }
                if (whichRadioButton == 1) {
                    mImageView2.setVisibility(View.INVISIBLE);
                }
                if (whichRadioButton == 2) {
                    mImageView2.setVisibility(View.VISIBLE);
                    switch (numberOfDice2) {
                        case 1:
                            mImageView2.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            mImageView2.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            mImageView2.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            mImageView2.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            mImageView2.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            mImageView2.setImageResource(R.drawable.dice6);
                            break;
                    }
                }

        }
    });
    // Todo Chapter 5까지 실습해보기
}
}
