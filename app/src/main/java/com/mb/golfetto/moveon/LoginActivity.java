package com.mb.golfetto.moveon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btnCad = (Button) findViewById(R.id.btnCriarConta);
        Button btnFace = (Button) findViewById(R.id.btnFacebook);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intentFace = new Intent(LoginActivity.this, DashActivity.class);
                    startActivity(intentFace);
                } catch (Exception ex){
                    Toast.makeText(LoginActivity.this,ex.getMessage().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });

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
                try{
                    Intent intentFace = new Intent(LoginActivity.this, DashActivity.class);
                    startActivity(intentFace);
                } catch (Exception ex){
                    Toast.makeText(LoginActivity.this,ex.getMessage().toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });



    }

}
