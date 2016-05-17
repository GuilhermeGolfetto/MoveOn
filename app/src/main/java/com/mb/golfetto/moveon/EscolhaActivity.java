package com.mb.golfetto.moveon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EscolhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        TextView txtPerderPeso = (TextView) findViewById(R.id.iniciar_exercicios);
        TextView txtGanharMassa = (TextView) findViewById(R.id.lista_exercicios);
        TextView txtAumentarForca = (TextView) findViewById(R.id.perfil);
        TextView txtDefinirCorpo = (TextView) findViewById(R.id.estatisticas);

        txtAumentarForca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiParaDash = new Intent(EscolhaActivity.this,DashActivity.class);
                startActivity(intentVaiParaDash);
            }
        });

        txtDefinirCorpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiParaDash = new Intent(EscolhaActivity.this,DashActivity.class);
                startActivity(intentVaiParaDash);
            }
        });

        txtPerderPeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiParaDash = new Intent(EscolhaActivity.this,DashActivity.class);
                startActivity(intentVaiParaDash);
            }
        });

        txtGanharMassa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiParaDash = new Intent(EscolhaActivity.this,DashActivity.class);
                startActivity(intentVaiParaDash);
            }
        });
    }
}
