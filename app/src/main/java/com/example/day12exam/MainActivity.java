package com.example.day12exam;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=findViewById(R.id.bt);
        final ImageView iv=findViewById(R.id.iv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(iv, "translationY", 0, 500);
                objectAnimator.setDuration(5000);
                objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimator.start();

            }
        });

    }
}
