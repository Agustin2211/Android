package com.example.botonera;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Botones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_botones);

        MediaPlayer mpCuandoVosTenesCalle = MediaPlayer.create(this, R.raw.cuando_vos_tenes_calle);
        MediaPlayer mpDefinicionDeCalle = MediaPlayer.create(this, R.raw.definicion_de_calle);
        MediaPlayer mpDefinicionDePala = MediaPlayer.create(this, R.raw.definicion_de_pala);
        MediaPlayer mpSeMalinterpreta = MediaPlayer.create(this, R.raw.se_malinterpreta);
        MediaPlayer mpTodoParaDecirQue = MediaPlayer.create(this, R.raw.todo_para_decir_que);
        MediaPlayer mpTodoParaDecirQueTieneContactos = MediaPlayer.create(this, R.raw.todo_para_decir_que_tiene_contactos);

        MediaPlayer mpXD = MediaPlayer.create(this, R.raw.xd);

        Button buttonCuandoVosTenesCalle = findViewById(R.id.buttonCuandoVosTenesCalle);
        Button buttonDefinicionDeCalle = findViewById(R.id.buttonDefinicionDeCalle);
        Button buttonDefinicionDePala = findViewById(R.id.buttonDefinicionDePala);
        Button buttonSeMalinterpreta = findViewById(R.id.buttonSeMalinterpreta);
        Button buttonTodoParaDecirQue = findViewById(R.id.buttonTodoParaDecirQue);
        Button buttonTodoParaDecirQueTieneContactos = findViewById(R.id.buttonTodoParaDecirQueTieneContactos);
        Button buttonXD = findViewById(R.id.buttonXD);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        buttonCuandoVosTenesCalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpCuandoVosTenesCalle.start();
            }
        });

        buttonDefinicionDeCalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpDefinicionDeCalle.start();
            }
        });

        buttonDefinicionDePala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpDefinicionDePala.start();
            }
        });

        buttonSeMalinterpreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpSeMalinterpreta.start();
            }
        });

        buttonTodoParaDecirQue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpTodoParaDecirQue.start();
            }
        });

        buttonTodoParaDecirQueTieneContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpTodoParaDecirQueTieneContactos.start();
            }
        });

        buttonXD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpXD.start();
            }
        });
    }
}