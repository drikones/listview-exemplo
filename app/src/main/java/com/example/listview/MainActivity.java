package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {"Angra dos Reis","Caldas Novas", "Campos do Jordão", "Costa do Sauípe","Ilhéus", "Porto Seguro",
    "Tiradentes","Praga","Santiago","Zurique","Caribe", "Buenos Aires", "Budapeste", "Cancún","Aruba","Acapulco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listLocais = findViewById(R.id.listLocais);

        //cria adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,android.R.id.text1,itens);
        listLocais.setAdapter(adaptador);

        //adicionar o clique na lista
        listLocais.setOnItemClickListener((adapterView, view, i, l) ->
        {
            String valorSelecionado = listLocais.getItemAtPosition(i).toString();
            Toast.makeText(this, valorSelecionado,Toast.LENGTH_SHORT).show();
        });

    }
}