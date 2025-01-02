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

        MediaPlayer mpCuandoVosTenesCalle= MediaPlayer.create(this, R.raw.cuando_vos_tenes_calle);
        MediaPlayer mpDefinicionDeCalle= MediaPlayer.create(this, R.raw.definicion_de_calle);
        Button buttonCuandoVosTenesCalle = findViewById(R.id.buttonCuandoVosTenesCalle);
        Button buttonDefinicionDeCalle = findViewById(R.id.buttonDefinicionDeCalle);

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
    }
}