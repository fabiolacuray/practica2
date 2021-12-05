package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class terceroActivity extends AppCompatActivity {

    private TextView nombre;
    private TextView base;

    private EditText apellido;
    private  EditText exponente;
    private EditText factorial;

    private Button cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercero);


        nombre = (TextView) findViewById(R.id.textV_nombre);
        nombre.setEnabled(false);

        base = (TextView) findViewById(R.id.textV_base);
        base.setEnabled(false);
        apellido = findViewById(R.id.editTextText_Apellido);
        exponente = findViewById(R.id.editText_Exponente);
        factorial = findViewById(R.id.editText_Numero);
        cerrar = findViewById(R.id.btn_cerrar);
        cerrar.setEnabled(false);


    }


}