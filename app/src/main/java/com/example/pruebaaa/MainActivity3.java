package com.example.pruebaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity3 extends AppCompatActivity {

    private TextView Nombree;
    private TextView apellido1;
    private TextView cargo1;

    private TextView sueldoB1;
    private TextView diasLab1;
    private TextView Resultado;
    private TextView valorDia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Nombree = findViewById(R.id.nombre);
        apellido1 = findViewById(R.id.Apellido);
        cargo1 = findViewById(R.id.Cargo);
        sueldoB1 = findViewById(R.id.SueldoB);
        diasLab1 = findViewById(R.id.DiasLab);
        Resultado = findViewById(R.id.Resultado);
        valorDia = findViewById(R.id.valorDia);

        Intent intent = getIntent();
        String Nombre = intent.getStringExtra("nombre");
        String apellido = intent.getStringExtra("Apellido");
        String cargo = intent.getStringExtra("Cargo");
        int sueldoB = intent.getIntExtra("SueldoB1", 0);
        int diasLab = intent.getIntExtra("DiasLab1", 0);
        int resultado = intent.getIntExtra("Resultado", 0);
        int ValorDia = intent.getIntExtra("valorDia", 0);




        Nombree.setText(Nombre);
        apellido1.setText(apellido);
        cargo1.setText(cargo);
        sueldoB1.setText(String.valueOf(sueldoB));
        diasLab1.setText(String.valueOf(diasLab));
        Resultado.setText(String.valueOf(resultado));
        valorDia.setText(String.valueOf(ValorDia));

        Button btnSalir = findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir();
            }

        });

    }


    private void salir() {
        finishAffinity();
    }



}


