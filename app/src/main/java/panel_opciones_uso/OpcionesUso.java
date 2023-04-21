package panel_opciones_uso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doitnow.R;

import panel_formulario_registro.FormularioActivity;

public class OpcionesUso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_uso);
    }
    public void volverFormulario (View view){
        Intent volverForm = new Intent(OpcionesUso.this, FormularioActivity.class);
        startActivity(volverForm);
    }
}