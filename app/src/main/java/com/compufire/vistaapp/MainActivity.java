package com.compufire.vistaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnText, btnButton, btnWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnText   = findViewById(R.id.btnText);
        btnButton = findViewById(R.id.btnButton);
        btnWidget = findViewById(R.id.btnWidget);

        // Abre TextActivity
        btnText.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            startActivity(intent);
        });

        btnButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });

        Button btnWidgets = findViewById(R.id.btnWidget);

        btnWidgets.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WidgetsActivity.class);
            startActivity(intent);
        });

        Button btnImage = findViewById(R.id.btnImage);

        btnImage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageActivity.class);
            startActivity(intent);
        });

    }
}