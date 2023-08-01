package com.example.pruebaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText Nombre;
    private EditText apellido;
    private EditText cargo;
    private EditText sueldoB;
    private EditText diasLab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Nombre = findViewById(R.id.Nombre);
        apellido = findViewById(R.id.apellido);
        cargo = findViewById(R.id.cargo);
        sueldoB = findViewById(R.id.sueldoB);
        diasLab = findViewById(R.id.diasLab);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = Nombre.getText().toString();
                String Apellido = apellido.getText().toString();
                String Cargo = cargo.getText().toString();
                String SueldoB = sueldoB.getText().toString();
                String DiasLab = diasLab.getText().toString();
                // Aquí abres la otra actividad
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

                Intent.putExtra("nombre", nombre);
                Intent.putExtra("Apellido", Apellido);
                Intent.putExtra("Cargo", Cargo);
                Intent.putExtra("SueldoB", SueldoB);
                Intent.putExtra("DiasLab", DiasLab);
                startActivity(intent);
            }
        });



        Button btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí abres la otra actividad
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}