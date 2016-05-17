package com.mb.golfetto.moveon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnCad = (Button) findViewById(R.id.btnCriarConta);
        Button btnFace = (Button) findViewById(R.id.btnFacebook);

        btnCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCad = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intentCad);
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFace = new Intent(LoginActivity.this, DashActivity.class);
                startActivity(intentFace);
            }
        });



    }

}
