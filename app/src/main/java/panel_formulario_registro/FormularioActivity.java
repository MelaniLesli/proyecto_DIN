package panel_formulario_registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import panel_opciones_uso.OpcionesUso;
import com.example.doitnow.R;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    public void onClick(View view){
        Intent irUtilidad = new Intent(FormularioActivity.this, OpcionesUso.class);
        startActivity(irUtilidad);
    }
}