package br.com.trainning.cadastro2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView textViewnomeProduto;
    TextView textViewnomeCategoria;
    TextView textViewcodigoBarras;

    final String TAG = "Tela2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        String nomeProduto = intent.getStringExtra("produto");
        String nomeCategoria = intent.getStringExtra("categoria");
        String codigoBarras = intent.getStringExtra("codigo");

        textViewnomeProduto = (TextView) findViewById(R.id.textViewnomeProduto);
        textViewnomeCategoria = (TextView) findViewById(R.id.textViewnomeCategoria);
        textViewcodigoBarras = (TextView) findViewById(R.id.textViewcodigoBarras);

        textViewnomeProduto.setText(nomeProduto);
        textViewnomeCategoria.setText(nomeCategoria);
        textViewcodigoBarras.setText(codigoBarras);

        Log.i(TAG,"onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG,"onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }
}
