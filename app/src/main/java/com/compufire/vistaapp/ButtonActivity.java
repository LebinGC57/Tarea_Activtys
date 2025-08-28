package com.compufire.vistaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {

    private Button btnNormal, btnBack;
    private ImageButton btnImage;
    private ToggleButton btnToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // Vincular vistas
        btnNormal = findViewById(R.id.btnNormal);
        btnImage  = findViewById(R.id.btnImage);
        btnToggle = findViewById(R.id.btnToggle);
        btnBack   = findViewById(R.id.btnBack);

        // Acción del botón normal
        btnNormal.setOnClickListener(v ->
                Toast.makeText(this, "¡Botón normal presionado!", Toast.LENGTH_SHORT).show()
        );

        // Acción del botón con imagen
        btnImage.setOnClickListener(v ->
                Toast.makeText(this, "¡Botón con imagen presionado!", Toast.LENGTH_SHORT).show()
        );

        // Acción del ToggleButton
        btnToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Toggle ENCENDIDO", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Toggle APAGADO", Toast.LENGTH_SHORT).show();
            }
        });

        // Regresar al menú
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ButtonActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(ButtonActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // cierra la activity actual
        });

    }
}