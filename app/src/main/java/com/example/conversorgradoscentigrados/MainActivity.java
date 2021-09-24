package com.example.conversorgradoscentigrados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private double centigrados = 0.0;
    private double kelvin = 0.0;
    private double farenheit = 0.0;
    private EditText edt_centigrados = null;

    private TextView txtKelvin = null;
    private TextView txtFarenheit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_centigrados = (EditText) findViewById(R.id.edt_Centigrados);
        txtKelvin = (TextView) findViewById(R.id.txtKelvin);
        txtFarenheit = (TextView) findViewById(R.id.txtFarenheit);
    }

    public void convertir(View view) {
        String texto = String.valueOf(edt_centigrados.getText());
        if(texto.isEmpty())
        {
            centigrados = 0.0;
        }
        else
        {
            centigrados = Double.valueOf(texto);

        }

        Log.i("pepe", "los centigrados valen " + String.valueOf(centigrados));
        kelvin = centigrados + 273.15;
        farenheit = centigrados * 9.0/5.0 + 32.0;
        txtKelvin.setText("Kelvin: " + String.valueOf(kelvin));
        txtFarenheit.setText("Farenheit: " + String.valueOf(farenheit));
        Toast.makeText(this, "Conversión Correcta", Toast.LENGTH_LONG).show();

    }
}