package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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


    public void OnclickSiguiente(View view) {
        /// pasar la informacion del main al segundo activity
        String nombr = nombre.getText().toString();
        String bas = base.getText().toString();

        if (!nombr.matches("") && !bas.matches("")) {
            Intent intent = new Intent(this, terceroActivity.class);
            ////metodo para pasar
            intent.putExtra("_nombre2", nombre.getText().toString());
            intent.putExtra("_base2", base.getText().toString());

            startActivity(intent);

        } else {
            //mostrar un mensaje cuando este vacio
            Toast.makeText(this, "Nombre y base son obligatorios",
                    Toast.LENGTH_LONG).show();
        }


    }



}