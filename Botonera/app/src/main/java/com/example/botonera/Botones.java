package com.example.botonera;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Botones extends AppCompatActivity {

    private int contadorBotonesPresionados = 0;
    private int totalBotones = 13;

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
        MediaPlayer mpTodoParaDecirQueLoVienenABuscar = MediaPlayer.create(this, R.raw.todo_para_decir_que_lo_vienen_a_buscar);
        MediaPlayer mpEstoNoEsSerioVieja = MediaPlayer.create(this, R.raw.esto_no_es_serio_vieja);
        MediaPlayer mpRutinaUNNOBA = MediaPlayer.create(this, R.raw.rutina_unnoba);
        MediaPlayer mpInvestiguenCarajo = MediaPlayer.create(this, R.raw.investiguen_carajo);
        MediaPlayer mpBalazo = MediaPlayer.create(this, R.raw.balazo);
        MediaPlayer mpRespiracion = MediaPlayer.create(this, R.raw.respiracion_automatica_desactivada);
        MediaPlayer mpBait = MediaPlayer.create(this, R.raw.era_bait);
        MediaPlayer mpXD = MediaPlayer.create(this, R.raw.xd);

        Button buttonCuandoVosTenesCalle = findViewById(R.id.buttonCuandoVosTenesCalle);
        Button buttonDefinicionDeCalle = findViewById(R.id.buttonDefinicionDeCalle);
        Button buttonDefinicionDePala = findViewById(R.id.buttonDefinicionDePala);
        Button buttonSeMalinterpreta = findViewById(R.id.buttonSeMalinterpreta);
        Button buttonTodoParaDecirQue = findViewById(R.id.buttonTodoParaDecirQue);
        Button buttonTodoParaDecirQueTieneContactos = findViewById(R.id.buttonTodoParaDecirQueTieneContactos);
        Button buttonTodoParaDecirQueLoVienenABuscar = findViewById(R.id.buttonTodoParaDecirQueLoVienenABuscar);
        Button buttonEstoNoEsSerioVieja = findViewById(R.id.buttonEstoNoEsSerioVieja);
        Button buttonRutinaUNNOBA = findViewById(R.id.buttonRutinaUNNOBA);
        Button buttonInvestiguenCarajo = findViewById(R.id.buttonInvestiguenCarajo);
        Button buttonBalazo = findViewById(R.id.buttonBalazo);
        Button buttonRespiracion = findViewById(R.id.buttonRespiracion);
        Button buttonBait = findViewById(R.id.buttonBait);
        Button buttonXD = findViewById(R.id.buttonXD);

        TextView tvCuandoVosTenesCalle = findViewById(R.id.tvCuandoVosTenesCalle);
        TextView tvDefinicionDeCalle = findViewById(R.id.tvDefinicionDeCalle);
        TextView tvDefinicionDePala = findViewById(R.id.tvDefinicionDePala);
        TextView tvSeMalinterpreta = findViewById(R.id.tvSeMalinterpreta);
        TextView tvTodoParaDecirQue = findViewById(R.id.tvTodoParaDecirQue);
        TextView tvTodoParaDecirQueTienenContactos = findViewById(R.id.tvTodoParaDecirQueTieneContactos);
        TextView tvTodoParaDecirQueLoVienenABuscar = findViewById(R.id.tvTodoParaDecirQueLoVienenABuscar);
        TextView tvEstoNoEsSerioVieja = findViewById(R.id.tvEstoNoEsSerioVieja);
        TextView tvRutinaUNNOBA = findViewById(R.id.tvRutinaUNNOBA);
        TextView tvInvestiguenCarajo = findViewById(R.id.tvInvestiguenCarajo);
        TextView tvBalazo = findViewById(R.id.tvBalazo);
        TextView tvRespiracion = findViewById(R.id.tvRespiracion);
        TextView tvBait = findViewById(R.id.tvBait);
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
                mpTodoParaDecirQueLoVienenABuscar.start();
                tvTodoParaDecirQueLoVienenABuscar.startAnimation(fadeInAnimation);
                tvTodoParaDecirQueLoVienenABuscar.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonEstoNoEsSerioVieja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpEstoNoEsSerioVieja.start();
                tvEstoNoEsSerioVieja.startAnimation(fadeInAnimation);
                tvEstoNoEsSerioVieja.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonRutinaUNNOBA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpRutinaUNNOBA.start();
                tvRutinaUNNOBA.startAnimation(fadeInAnimation);
                tvRutinaUNNOBA.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonInvestiguenCarajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpInvestiguenCarajo.start();
                tvInvestiguenCarajo.startAnimation(fadeInAnimation);
                tvInvestiguenCarajo.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        buttonBalazo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpBalazo.start();
                tvBalazo.startAnimation(fadeInAnimation);
                tvBalazo.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        //TODO Button Respiracion
        buttonRespiracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpRespiracion.start();
                tvRespiracion.startAnimation(fadeInAnimation);
                tvRespiracion.setVisibility(View.VISIBLE);
                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }

                mpRespiracion.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mostrarDialogoVideo();
                    }
                });
            }
        });

        buttonBait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpBait.start();
                tvBait.startAnimation(fadeInAnimation);
                tvBait.setVisibility(View.VISIBLE);

                contadorBotonesPresionados++;
                if (contadorBotonesPresionados == totalBotones) {
                    cambiarVisibilidad(tvXD, buttonXD, fadeInAnimation);
                }
            }
        });

        //TODO BOTON FINAL
        buttonXD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpXD.start();
            }
        });
    }


    //TODO FUNCIONES
    private void cambiarVisibilidad(TextView tvXD, Button buttonXD, Animation fadeInAnimation){
        tvXD.startAnimation(fadeInAnimation);
        buttonXD.startAnimation(fadeInAnimation);
        tvXD.setVisibility(View.VISIBLE);
        buttonXD.setVisibility(View.VISIBLE);
    }

    private void mostrarDialogoVideo() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_video);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dialog.getWindow().getDecorView().setVisibility(View.INVISIBLE);
        dialog.getWindow().getDecorView().post(new Runnable() {
            @Override
            public void run() {
                dialog.getWindow().getDecorView().startAnimation(AnimationUtils.loadAnimation(Botones.this, R.anim.fade_in));
                dialog.getWindow().getDecorView().setVisibility(View.VISIBLE);
            }
        });

        VideoView videoView = dialog.findViewById(R.id.videoView);
        Button buttonClose = dialog.findViewById(R.id.buttonCerrar);

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.outro_coscu);
        videoView.setVideoURI(videoUri);
        videoView.start();

        buttonClose.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }
}