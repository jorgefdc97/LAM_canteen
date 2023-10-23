package com.example.cantina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    public static String OPTION_MEAL = "";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = new Intent(this, MainActivity3.class);
    }

    public void onClick(View view){
        Button btn = (Button) view;
        OPTION_MEAL = btn.getText().toString();
        startActivity(intent);
    }

    public void onClickBack(View view){
        finish();
    }
}