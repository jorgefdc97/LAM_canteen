package com.example.cantina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView = findViewById(R.id.mealTextView);
        textView.setText(String.format("%s\n\n%s %s\n%s %s\n%s %s", getString(R.string.menu),
                getString(R.string.soup), MainActivity.OPTION_SOUP, getString(R.string.mainDish),
                MainActivity2.OPTION_MEAL, getString(R.string.dessert), MainActivity3.OPTION_DESSERT));
    }
}