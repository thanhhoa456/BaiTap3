package com.example.loginregistrationdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class AutoBackground extends AppCompatActivity {
    private static final int[] backgroundImages = {
            R.drawable.background_intro, R.drawable.bottom_btn1,
            R.drawable.cat_1, R.drawable.pop_3, R.drawable.cat_3,
            R.drawable.pizza, R.drawable.profile
    };
    private View rootView;
    private Switch switchBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_changebg);

        rootView = findViewById(android.R.id.content);

        applyRandomBackground();

        switchBackground = findViewById(R.id.switchBackground);

        switchBackground.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                applyRandomBackground();
            }
        });
    }

    private void applyRandomBackground() {
        int randomBg = backgroundImages[new Random().nextInt(backgroundImages.length)];
        rootView.setBackgroundResource(randomBg);
    }
}
