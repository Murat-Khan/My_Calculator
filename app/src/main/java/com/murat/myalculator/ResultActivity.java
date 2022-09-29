package com.murat.myalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

       String text = getIntent().getStringExtra("solution");
        TextView textView1 = findViewById(R.id.text_view1);
        textView1.setText(text);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.myalpha);
       textView1.setAnimation(animation1);
        animation1.setDuration(3000);

        TextView policy = findViewById(R.id.policy);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        policy.setAnimation(animation2);
        animation2.setDuration(2000);

        TextView productCategory = findViewById(R.id.product_category);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        productCategory.setAnimation(animation3);
        animation3.setDuration(1500);
        TextView originCountry = findViewById(R.id.origin_country);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        originCountry.setAnimation(animation4);
        animation4.setDuration(1000);
        TextView brand = findViewById(R.id.brand);
        Animation animation5 = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        brand.setAnimation(animation5);
        animation5.setDuration(500);






        findViewById(R.id.exit).setOnClickListener(view ->{
            finish();
            moveTaskToBack(true);
        });
    }
}