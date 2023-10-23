package com.example.cantina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    public static String OPTION_DESSERT = "";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        intent = new Intent(this, MainActivity4.class);
    }

    public void onClick(View view){
        Button btn = (Button) view;
        OPTION_DESSERT = btn.getText().toString();
        startActivity(intent);
    }

    public void onClickBack(View view){
        finish();
    }
}