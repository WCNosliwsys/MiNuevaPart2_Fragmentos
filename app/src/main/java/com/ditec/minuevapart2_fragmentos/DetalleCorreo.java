package com.ditec.minuevapart2_fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    TextView TxtDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);
        TxtDetalle = findViewById(R.id.TxtDetalle);
        TxtDetalle.setText("De: "+getIntent().getExtras().getString("de")+
                " Asunto: "+getIntent().getExtras().getString("asunto")+
                " Contenido: "+getIntent().getExtras().getString("texto"));
    }
}