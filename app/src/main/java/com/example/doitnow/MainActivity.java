package com.example.doitnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import panel_formulario_registro.FormularioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*Cambio de Pantalla al formulario Registro*/
    public void onClick(View view) {
        Intent irForm = new Intent(MainActivity.this, FormularioActivity.class);
        startActivity(irForm);
    }
}