package com.compufire.vistaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {

    private EditText editInput;
    private TextView txtResult;
    private Button btnShow, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        // Vincular vistas con Java
        editInput = findViewById(R.id.editInput);
        txtResult = findViewById(R.id.txtResult);
        btnShow   = findViewById(R.id.btnShow);
        btnBack   = findViewById(R.id.btnBack);

        // Botón: mostrar el texto escrito en el EditText
        btnShow.setOnClickListener(v -> {
            String texto = editInput.getText().toString();
            txtResult.setText(texto);
        });

        // Botón: regresar a MainActivity
        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(TextActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // <- cierra la actividad actual
        });

    }
}