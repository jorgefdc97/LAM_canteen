package com.example.cantina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static String OPTION_SOUP = "";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, MainActivity2.class);
    }

    public void onClick(View view){
        Button btn = (Button) view;
        OPTION_SOUP = btn.getText().toString();
        startActivity(intent);
    }
}