package com.compufire.vistaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {

    private ImageView imgExample;
    private Button btnChangeImage, btnBack;
    private boolean isDefault = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imgExample = findViewById(R.id.imgExample);
        btnChangeImage = findViewById(R.id.btnChangeImage);
        btnBack = findViewById(R.id.btnBack);

        // Cambiar imagen al presionar el botón
        btnChangeImage.setOnClickListener(v -> {
            if (isDefault) {
                imgExample.setImageResource(android.R.drawable.ic_menu_camera);
                isDefault = false;
            } else {
                imgExample.setImageResource(android.R.drawable.ic_menu_gallery);
                isDefault = true;
            }
        });

        // Regresar al menú
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ImageActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}