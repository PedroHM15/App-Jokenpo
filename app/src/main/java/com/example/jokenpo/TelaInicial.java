package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {
    public static int pontoJogador, pontoB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);



    }

    public void Jogar(View v) {
        Intent ir_escolha = new Intent(TelaInicial.this, TelaEscolha.class);
        startActivity(ir_escolha);
        pontoJogador=0;
        pontoB=0;
    }
}