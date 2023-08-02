package com.example.pruebaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
public class MainActivity2 extends AppCompatActivity {

    private EditText Nombre;
    private EditText apellido;
    private EditText cargo;
    private EditText sueldoB;

    private CheckBox descuento, salud, pension;
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
        descuento = findViewById(R.id.descuento);
        salud = findViewById(R.id.salud);
        pension = findViewById(R.id.pension);


        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = Nombre.getText().toString();
                String Apellido = apellido.getText().toString();
                String Cargo = cargo.getText().toString();
                String SueldoB = sueldoB.getText().toString();
                int SueldoB1 = Integer.parseInt(SueldoB);
                String DiasLab = diasLab.getText().toString();
                int DiasLab1 = Integer.parseInt(DiasLab);
                Boolean Descuento = descuento.isChecked();
                Boolean Salud = salud.isChecked();
                Boolean Pension = pension.isChecked();
                int totalDescuentos= 0;

                if (Descuento==true){
                    totalDescuentos+=SueldoB1*0.03;
                }
                if (Salud==true){
                    totalDescuentos+=SueldoB1*0.04;
                }
                if (Pension==true){
                    totalDescuentos+=SueldoB1*0.04;
                }

                int Resultado= SueldoB1-totalDescuentos;

                int valorDia= SueldoB1/30;

                Intent datos = new Intent(MainActivity2.this, MainActivity3.class);


                datos.putExtra("nombre", nombre);
                datos.putExtra("Apellido", Apellido);
                datos.putExtra("Cargo", Cargo);
                datos.putExtra("SueldoB1", SueldoB1);
                datos.putExtra("DiasLab1", DiasLab1);
                datos.putExtra("Resultado", Resultado);
                datos.putExtra("valorDia", valorDia);
                startActivity(datos);
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