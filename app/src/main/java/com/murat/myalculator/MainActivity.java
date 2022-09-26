package com.murat.myalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double fest;
    private Double second;
    private boolean isOperationClick;
    private Double result;
    private String operation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                numberClick("1");
                break;
            case R.id.btn_two:
                numberClick("2");
                break;
            case R.id.btn_three:
                numberClick("3");
                break;
            case R.id.btn_four:
                numberClick("4");
                break;
            case R.id.btn_five:
                numberClick("5");
                break;
            case R.id.btn_six:
                numberClick("6");
                break;
            case R.id.btn_seven:
                numberClick("7");
                break;
            case R.id.btn_eight:
                numberClick("8");
                break;
            case R.id.btn_nine:
                numberClick("9");
                break;
            case R.id.btn_zero:
                numberClick("0");
                if (textView.getText().length() > 0)
                break;
            case R.id.btn_clear:
                textView.setText("0");
                fest = Double.valueOf(0);
                second = Double.valueOf(0);
                break;
            case R.id.btn_dot:
                numberClick(".");

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
                break;
            case R.id.btn_minus:
                operation = "-";
                fest = Double.parseDouble(textView.getText().toString());
                break;
            case R.id.btn_multiply:
                operation = "*";
                fest = Double.parseDouble(textView.getText().toString());
                break;
            case R.id.btn_divide:
                operation = "/";
                fest = Double.parseDouble(textView.getText().toString());
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

        }
        isOperationClick = true;
    }
}