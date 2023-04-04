package com.example.doitnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UtilidadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utilidad);
    }
    public void volverFormulario (View view){
        Intent volverForm = new Intent(UtilidadActivity.this, FormularioActivity.class);
        startActivity(volverForm);
    }
}