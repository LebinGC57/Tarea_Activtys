package com.compufire.vistaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity extends AppCompatActivity {

    private CheckBox checkPizza, checkBurger;
    private RadioGroup radioGroup;
    private Switch switchMode;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        // Vincular vistas
        checkPizza = findViewById(R.id.checkPizza);
        checkBurger = findViewById(R.id.checkBurger);
        radioGroup = findViewById(R.id.radioGroup);
        switchMode = findViewById(R.id.switchMode);
        btnBack = findViewById(R.id.btnBack);

        // Eventos CheckBox
        checkPizza.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Te gusta la Pizza 🍕", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Quitaste Pizza", Toast.LENGTH_SHORT).show();
            }
        });

        checkBurger.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Te gusta la Hamburguesa 🍔", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Quitaste Hamburguesa", Toast.LENGTH_SHORT).show();
            }
        });

        // Eventos RadioGroup
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selected = findViewById(checkedId);
            Toast.makeText(this, "Elegiste: " + selected.getText(), Toast.LENGTH_SHORT).show();
        });

        // Evento Switch
        switchMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Modo ACTIVADO", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Modo DESACTIVADO", Toast.LENGTH_SHORT).show();
            }
        });

        // Botón regresar
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(WidgetsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(WidgetsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });


    }
}