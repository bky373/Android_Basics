package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowMyAlbum extends AppCompatActivity {
    ImageView mImageView;
    Button[] mButtons = new Button[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myalbum);

        mImageView = findViewById(R.id.image);
        for (int i = 0; i < mButtons.length; i++) {
            mButtons[i] = findViewById(R.id.button_1 + i);
            mButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button_1:
                            mImageView.setImageResource(R.drawable.baby1);
                            mButtons[0].setAlpha(1.0f);
                            mButtons[1].setAlpha(0.3f);
                            mButtons[2].setAlpha(0.3f);
                            mButtons[3].setAlpha(0.3f);
                            break;
                        case R.id.button_2:
                            mImageView.setImageResource(R.drawable.baby2);
                            mButtons[1].setAlpha(1.0f);
                            mButtons[0].setAlpha(0.3f);
                            mButtons[2].setAlpha(0.3f);
                            mButtons[3].setAlpha(0.3f);
                            break;
                        case R.id.button_3:
                            mImageView.setImageResource(R.drawable.plants);
                            mButtons[2].setAlpha(1.0f);
                            mButtons[0].setAlpha(0.3f);
                            mButtons[1].setAlpha(0.3f);
                            mButtons[3].setAlpha(0.3f);
                            break;
                        case R.id.button_4:
                            mImageView.setImageResource(R.drawable.ladybugs);
                            mButtons[3].setAlpha(1.0f);
                            mButtons[0].setAlpha(0.3f);
                            mButtons[1].setAlpha(0.3f);
                            mButtons[2].setAlpha(0.3f);
                            break;
                    }
                }
            });
        }
    }
}
