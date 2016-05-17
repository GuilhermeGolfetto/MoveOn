package com.mb.golfetto.moveon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        TextView txtInitEx = (TextView) findViewById(R.id.iniciar_exercicios);
        TextView txtListEx = (TextView) findViewById(R.id.lista_exercicios);
        TextView txtEstatisticas = (TextView) findViewById(R.id.estatisticas);
        TextView txtPerfil = (TextView) findViewById(R.id.perfil);

        txtInitEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this, "Em breve", Toast.LENGTH_SHORT).show();
            }
        });

        txtListEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this, "Em breve",Toast.LENGTH_SHORT).show();
            }
        });

        txtEstatisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this, "Em breve",Toast.LENGTH_SHORT).show();
            }
        });

        txtPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this, "Em breve",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
