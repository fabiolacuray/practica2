package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class segundoActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText base;
    private EditText apellido;
    private EditText exponente;
    private EditText factorial;
    private Button siguiente;
    private Button cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        nombre = (EditText) findViewById(R.id.editTextText_Nombre);
        base = (EditText) findViewById(R.id.editText_base);

        siguiente = findViewById(R.id.btn_siguiente);
        cerrar = findViewById(R.id.btn_cerrar);
        cerrar.setEnabled(false);


    }


}