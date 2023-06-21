package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class Resultado extends AppCompatActivity {
    int escolha2 = TelaEscolha.escolha;
    int bot=0,acabou=0;

    ImageView escolhaBot;
    TextView resultado,placar;
    int pontoBot=TelaInicial.pontoB, pontoPlayer = TelaInicial.pontoJogador, round=0;

    String Res;

    TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        iniciar();
            //Pedra = 0
            //Papel = 1
            //Tesoura = 2
        Random rand = new Random();

        bot = rand.nextInt(3);

        if(escolha2==bot){
            Res="Deu Empate";
        }
        else if(escolha2==0 && bot == 1){
            Res="Você perdeu";
            TelaInicial.pontoB++;
            round++;
        }
        else if(escolha2==0 && bot == 2){
            Res="Você Venceu";
            TelaInicial.pontoJogador++;
            round++;
        }
        else if(escolha2==1 && bot==0){
            Res="Você Venceu";
            TelaInicial.pontoJogador++;
            round++;
        }
        else if(escolha2==1 && bot==2){
            Res="Você perdeu";
            TelaInicial.pontoB++;
            round++;
        }
        else if(escolha2==2 && bot==0){
            Res="Você perdeu";
            TelaInicial.pontoB++;
            round++;
        }
        else if(escolha2==2 && bot==1){
            Res="Você Venceu";
            TelaInicial.pontoJogador++;
            round++;
        }
        if (bot==0){
            escolhaBot.setImageResource(R.drawable.pedra_removebg_preview);
        }
        else if (bot==1) {
            escolhaBot.setImageResource(R.drawable.papel_removebg_preview);
        }
        else if (bot==2) {
            escolhaBot.setImageResource(R.drawable.tesoura_removebg_preview);
        }
        if(TelaInicial.pontoJogador==3){
            Res="Você Ganhou do BOT parabéns";
            resultado.setText(Res);
            placar.setText("Bot: "+ String.valueOf(TelaInicial.pontoB)+"-"+"Player: "+String.valueOf(TelaInicial.pontoJogador));
            acabou=1;
        }
        else if (TelaInicial.pontoB==3) {
            Res="Você foi derrodado miseravelmente pelo BOT";
            resultado.setText(Res);
            placar.setText("Bot: "+ String.valueOf(TelaInicial.pontoB)+"-"+"Player: "+String.valueOf(TelaInicial.pontoJogador));
            acabou=1;
        }

        resultado.setText(Res);
        placar.setText("Bot: "+ String.valueOf(TelaInicial.pontoB)+"-"+"Player: "+String.valueOf(TelaInicial.pontoJogador));

    }

    private void iniciar() {
        escolhaBot = findViewById(R.id.escolha_bot);
        resultado = findViewById(R.id.resultado);
        placar = findViewById(R.id.Placar);
    }
    public void PlayAgain(View v){
        if (acabou==1){
            Intent playAgain = new Intent(this, TelaInicial.class);
            startActivity(playAgain);
        }
        else {
            Intent playAgain = new Intent(this, TelaEscolha.class);
            startActivity(playAgain);
        }
    }
}