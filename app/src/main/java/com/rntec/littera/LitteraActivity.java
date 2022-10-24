package com.rntec.littera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.rntec.littera.model.Autor;
import com.rntec.littera.util.UtilAutor;

import java.util.ArrayList;
import java.util.List;

public class LitteraActivity extends AppCompatActivity {

    private Spinner spinnerAutores;
    private TextView textDescAutor, textObrasAutor;
    private Autor autor = new Autor();
    private List<String> obras =  new ArrayList<String>();
    private UtilAutor utilAutor = new UtilAutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_littera);


        spinnerAutores  = findViewById(R.id.spinnerAutores);
        textDescAutor   = findViewById(R.id.textDescAutorVazio);
        textObrasAutor  = findViewById(R.id.textObrasAutorVazio);

    }


    public void onClickSaberMais(View view){


      int posicaoAutor = spinnerAutores.getSelectedItemPosition();

      autor = utilAutor.retornarAutor(posicaoAutor);

      if(autor != null){
          textDescAutor.setText(String.valueOf(autor.getDescricao()));

          StringBuilder stringBuilder = new StringBuilder();

          obras = autor.getObras();

          for(String obra : obras){
              stringBuilder.append(obra).append("\n");
          }

          textObrasAutor.setText(stringBuilder);

          obras.clear();

      }else{
          Toast.makeText(getApplicationContext(), "Escolha um autor:)", Toast.LENGTH_LONG).show();
      }




    }




}