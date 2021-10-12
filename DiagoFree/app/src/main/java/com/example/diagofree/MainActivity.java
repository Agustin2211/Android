package com.example.diagofree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView pantallaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        pantallaPrincipal = (WebView)findViewById(R.id.activity_principal);
        WebSettings webSettings = pantallaPrincipal.getSettings();

        //SI TENGO JavaScript EN LA PAGINA, TAMBIEN LO LEVANTA
        webSettings.setJavaScriptEnabled(true);

        //LE ASIGNO LA URL QUE QUIERO QUE ABRA
        pantallaPrincipal.loadUrl("diagofree.000webhostapp.com");

        //SEGUIR ESTANDO EN LA APLICACION SI INTERACTUO CON LA PAGINA
        pantallaPrincipal.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        //CONDICION PARA PODER NAVEGAR CON LOS BOTONES DEL CELULAR
        if(pantallaPrincipal.canGoBack()){
            pantallaPrincipal.goBack();
        }else{
            super.onBackPressed();
        }
    }
}