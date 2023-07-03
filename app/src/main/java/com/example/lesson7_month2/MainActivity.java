package com.example.lesson7_month2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    Integer first, second, result;
    Boolean isOperationClick;
    Process operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Button button = findViewById(R.id.bottom);
        button.setOnClickListener(view -> {
            intent.putExtra("key", result.toString());
            startActivity(intent);
        });
    }

    public void OnNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_0:
                if(textView.getText().toString().equals("0")
                        || isOperationClick){
                    textView.setText("0");
                }else {
                    textView.append("0");
                }
                break;
            case R.id.btn_1:
                if(textView.getText().toString().equals("0")
                        || isOperationClick){
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.btn_2:
                if(textView.getText().toString().equals("0")
                        || isOperationClick){
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
                break;
            case R.id.btn_3:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;

            case R.id.btn_4:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;

            case R.id.btn_5:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;

            case R.id.btn_6:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;

            case R.id.btn_7:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;

            case R.id.btn_8:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_9:
                // нажал на двойку
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;

            case R.id.btn_clear:
                first = 0;
                second = 0;
                    textView.setText("0");

                }
        isOperationClick = false;

        ((Button) findViewById(R.id.bottom)).setVisibility(View.GONE);
        }

    public void OnOperationCLick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Process.PLUS;
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                operation = Process.MINUS;

                break;
            case R.id.btn_division:
                operation = Process.DIVISION;

                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_multiplication:
                operation = Process.MULTIPLICATION;
                first = Integer.valueOf(textView.getText().toString());
                break;

            case R.id.btn_equal:
                if (operation == Process.PLUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first + second;
                    textView.setText(result.toString());
                } else if (operation == Process.MINUS) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first - second;
                    textView.setText(result.toString());
                } else if (operation == Process.DIVISION) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first / second;
                    textView.setText(result.toString());
                } else if (operation == Process.MULTIPLICATION) {
                    second = Integer.valueOf(textView.getText().toString());
                    result = first * second;
                    textView.setText(result.toString());
                }
                ((Button) findViewById(R.id.bottom)).setVisibility(View.VISIBLE);
        break;}
        isOperationClick = true;

    }

}
