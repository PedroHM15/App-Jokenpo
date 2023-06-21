package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaEscolha extends AppCompatActivity {
    public static int escolha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha);


    }
    public void Pedra(View v){
        escolha = 0;

        Intent ir_resultado = new Intent(this, Resultado.class);
        startActivity(ir_resultado);
    }
    public void Papel(View v){
        escolha = 1;

        Intent ir_resultado = new Intent(this, Resultado.class);
        startActivity(ir_resultado);
    }
    public void Tesoura(View v){
        escolha = 2;

        Intent ir_resultado = new Intent(this, Resultado.class);
        startActivity(ir_resultado);
    }

}