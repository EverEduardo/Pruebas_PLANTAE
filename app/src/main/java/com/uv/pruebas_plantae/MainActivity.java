package com.uv.pruebas_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button btnEntrar, btnIrRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.usuario);
        pass = (EditText) findViewById(R.id.contrasena);
        btnEntrar = (Button) findViewById(R.id.btn_IniciarSesion);
        btnIrRegistro = (Button) findViewById(R.id.btn_irRegistro);


    }


    public void irMenu(View view){
        Intent i = new Intent(this, Barra_navegacion.class);
        startActivity(i);
    }

    public void irRegistro(View view){
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }




}