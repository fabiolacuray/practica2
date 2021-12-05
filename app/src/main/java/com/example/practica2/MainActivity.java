package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nombre;
    private TextView apellido;
    private TextView base;
    private TextView exponente;
    private TextView factorial;
    private TextView potencia;
    private Button siguiente;
    private  Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.textV_nombre);
        nombre.setEnabled(false);
        apellido = findViewById(R.id.textV_apellido);
        apellido.setEnabled(false);
        base = findViewById(R.id.textV_base);
        base.setEnabled(false);
        exponente = findViewById(R.id.textV_exponente);
        exponente.setEnabled(false);
        factorial = findViewById(R.id.textV_factorial);
        factorial.setEnabled(false);
        potencia = findViewById(R.id.textV_potencia);
        potencia.setEnabled(false);

        siguiente = findViewById(R.id.btn_siguiente);

        mostrar = findViewById(R.id.btn_mostrar);
        mostrar.setEnabled(false);



    }



}