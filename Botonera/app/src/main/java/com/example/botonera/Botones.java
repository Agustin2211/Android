package com.example.botonera;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Botones extends AppCompatActivity {

    private int contadorBotonesPresionados = 0;
    private int totalBotones = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_botones);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

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
        Button buttonTodoParaDecirQueLoVienenABuscar = findViewById(R.id.buttonTodoParaDecirQueLoVienenABuscar);
        Button buttonXD = findViewById(R.id.buttonXD);

        TextView tvCuandoVosTenesCalle = findViewById(R.id.tvCuandoVosTenesCalle);
        TextView tvDefinicionDeCalle = findViewById(R.id.tvDefinicionDeCalle);
        TextView tvDefinicionDePala = findViewById(R.id.tvDefinicionDePala);
        TextView tvSeMalinterpreta = findViewById(R.id.tvSeMalinterpreta);
        TextView tvTodoParaDecirQue = findViewById(R.id.tvTodoParaDecirQue);
        TextView tvTodoParaDecirQueTienenContactos = findViewById(R.id.tvTodoParaDecirQueTieneContactos);
        TextView tvTodoParaDecirQueLoVienenABuscar = findViewById(R.id.tvTodoParaDecirQueLoVienenABuscar);
        TextView tvXD = findViewById(R.id.tvXD);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        buttonCuandoVosTenesCalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpCuandoVosTenesCalle.start();
                tvCuandoVosTenesCalle.startAnimation(fadeInAnimation);
                tvCuandoVosTenesCalle.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonDefinicionDeCalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpDefinicionDeCalle.start();
                tvDefinicionDeCalle.startAnimation(fadeInAnimation);
                tvDefinicionDeCalle.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonDefinicionDePala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpDefinicionDePala.start();
                tvDefinicionDePala.startAnimation(fadeInAnimation);
                tvDefinicionDePala.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonSeMalinterpreta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpSeMalinterpreta.start();
                tvSeMalinterpreta.startAnimation(fadeInAnimation);
                tvSeMalinterpreta.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonTodoParaDecirQue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpTodoParaDecirQue.start();
                tvTodoParaDecirQue.startAnimation(fadeInAnimation);
                tvTodoParaDecirQue.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonTodoParaDecirQueTieneContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpTodoParaDecirQueTieneContactos.start();
                tvTodoParaDecirQueTienenContactos.startAnimation(fadeInAnimation);
                tvTodoParaDecirQueTienenContactos.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonTodoParaDecirQueLoVienenABuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTodoParaDecirQueLoVienenABuscar.startAnimation(fadeInAnimation);
                tvTodoParaDecirQueLoVienenABuscar.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonXD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpXD.start();
            }
        });
    }

    private void cambiarVisibilidad(TextView tvXD, Button buttonXD, Animation fadeInAnimation){
        tvXD.startAnimation(fadeInAnimation);
        buttonXD.startAnimation(fadeInAnimation);
        tvXD.setVisibility(View.VISIBLE);
        buttonXD.setVisibility(View.VISIBLE);
    }
}