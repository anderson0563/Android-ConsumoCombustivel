package br.santos.anderson.consumocombustvel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        EditText km = (EditText)findViewById(R.id.km);
        EditText litro = (EditText)findViewById(R.id.litro);
        double kmNumero = Double.parseDouble(km.getText().toString());
        double litroNumero = Double.parseDouble(litro.getText().toString());
        double consumo = kmNumero/litroNumero;
        Toast.makeText(this, String.valueOf(consumo), Toast.LENGTH_LONG).show();
    }
}