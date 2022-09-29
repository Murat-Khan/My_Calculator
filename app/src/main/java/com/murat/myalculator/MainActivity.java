package com.murat.myalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double fest;
    private Double second;
    private boolean isOperationClick;
    private Double result;
    private String operation;
    private Button getResult;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        getResult = findViewById(R.id.get_result);






    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                numberClick("1");
                getResult.setAlpha(0);
                break;
            case R.id.btn_two:
                numberClick("2");
                getResult.setAlpha(0);
                break;
            case R.id.btn_three:
                numberClick("3");
                getResult.setAlpha(0);
                break;
            case R.id.btn_four:
                numberClick("4");
                getResult.setAlpha(0);
                break;
            case R.id.btn_five:
                numberClick("5");
                getResult.setAlpha(0);
                break;
            case R.id.btn_six:
                numberClick("6");
                getResult.setAlpha(0);
                break;
            case R.id.btn_seven:
                numberClick("7");
                getResult.setAlpha(0);
                break;
            case R.id.btn_eight:
                numberClick("8");
                getResult.setAlpha(0);
                break;
            case R.id.btn_nine:
                numberClick("9");
                getResult.setAlpha(0);
                break;
            case R.id.btn_zero:
                numberClick("0");
                getResult.setAlpha(0);
                if (textView.getText().length() > 0)
                break;
            case R.id.btn_clear:
                textView.setText("0");
                getResult.setAlpha(0);
                fest = Double.valueOf(0);
                second = Double.valueOf(0);
                break;
            case R.id.btn_dot:
                numberClick(".");
                getResult.setAlpha(0);
        }
        isOperationClick =false;
    }
    private void numberClick(String s) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(s);
        } else if (isOperationClick) {
            textView.setText(s);
        } else {
            textView.append(s);
        }
    }



    public void onOperationClick(View view) {

        switch (view.getId()){
            case R.id.btn_plus:
                operation = "+";
                fest = Double.parseDouble(textView.getText().toString());
                getResult.setAlpha(0);
                break;
            case R.id.btn_minus:
                operation = "-";
                fest = Double.parseDouble(textView.getText().toString());
                getResult.setAlpha(0);
                break;
            case R.id.btn_multiply:
                operation = "*";
                fest = Double.parseDouble(textView.getText().toString());
                getResult.setAlpha(0);
                break;
            case R.id.btn_divide:
                operation = "/";
                fest = Double.parseDouble(textView.getText().toString());
                getResult.setAlpha(0);
                break;
            case R.id.btn_equals:
                second = Double.parseDouble(textView.getText().toString());
                switch (operation){
                    case "+":
                        result = fest + second;
                        break;
                    case "-":
                        result = fest - second;
                        break;
                    case "/":
                        result = fest / second;
                        break;
                    case "*" :
                        result = fest * second;
                        break;
                }
                textView.setText(result.toString());
                String secondResult = textView.getText().toString();
                secondResult.equals(result);
                getResult.setAlpha(1);
                findViewById(R.id.get_result).setOnClickListener(view1 ->{
                    Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                    intent.putExtra("solution",secondResult);
                    startActivity(intent);
                });











        }
        isOperationClick = true;

    }

}