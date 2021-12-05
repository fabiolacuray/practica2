package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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


        /////pongo los datos del segundo////
        Bundle datosdelsegundo = this.getIntent().getExtras();
        String nombr = datosdelsegundo.getString("_nombre2").toUpperCase();
        String bas = datosdelsegundo.getString("_base2");
        nombre.setText(nombr);
        base.setText(bas);

        factorial.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.toString().equals("")){
                    cerrar.setEnabled(false);
                }else{
                    cerrar.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().equals("")){
                    cerrar.setEnabled(false);
                }else{
                    cerrar.setEnabled(true);
                }
            }
        });


    }


    public void OnclickCerr (View view){
        Intent intent = new Intent(this, segundoActivity.class);
        this.startActivity(intent);
    }





}