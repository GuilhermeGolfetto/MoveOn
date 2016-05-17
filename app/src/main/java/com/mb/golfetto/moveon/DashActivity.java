package com.mb.golfetto.moveon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);

        TextView txtInitEx = (TextView) findViewById(R.id.txtiniciar_exercicios);
        TextView txtListEx = (TextView) findViewById(R.id.txtlista_exercicios);
        TextView txtEstatisticas = (TextView) findViewById(R.id.txtestatisticas);
        TextView txtPerfil = (TextView) findViewById(R.id.txtperfil);

        txtInitEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashActivity.this, "Em breve", Toast.LENGTH_SHORT).show();
            }
        });

        txtListEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashActivity.this, "Em breve",Toast.LENGTH_SHORT).show();
            }
        });

        txtEstatisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashActivity.this, "Em breve",Toast.LENGTH_SHORT).show();
            }
        });

        txtPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashActivity.this, "Em breve",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
