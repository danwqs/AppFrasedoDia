package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Você só sai do preto e branco se passa um nova tonalidade a sua vida",
                "O que a vida me reserva o só o tempo me dirá como realmente devo guiar",
                "Desistir dos seus objetivos não pode ser opção!",
                "Um bom dia só nasce quando suas boas ações não forem em função de si mesmo.",
                "Você é realmente bom no que faz se seu esforço foi o que te trouxe pra chegar onde estar",
                "Talvez sua alma so espere o momento certo de repousa a minha!",
                "A oração é como o oxigênio, se faz necessária em nosso dia-a-dia."

        };
        int numero = new Random().nextInt(7);

        TextView texto = findViewById(R.id.textView);
        texto.setText(frases[numero]);

    }
}