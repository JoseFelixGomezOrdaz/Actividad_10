package com.example.josefelix.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double resultado;
    private TextView ShowResultado;
    private TextView num1;
    private TextView num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowResultado = (EditText) findViewById(R.id.et_resultado);
        num1 = (EditText) findViewById(R.id.et_numero1);
        num2 = (EditText) findViewById(R.id.et_numero2);
    }
    public void Suma(View view) {
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = num1 + num2;
            if (ShowResultado != null)
                ShowResultado.setText(Double.toString(resultado));
        }catch (Exception e){
            Log.e("Error","Error en la suma");
        }
    }
    public void Resta(View view) {
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 - num2);
            if (ShowResultado != null)
                ShowResultado.setText(Double.toString(resultado));
        }catch (Exception e){
            Log.e("Error","Error en la resta");
        }
    }

    public void Mult(View view) {
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 * num2);

            if (ShowResultado != null)
                ShowResultado.setText(Double.toString(resultado));
        }
        catch (Exception e){
            Log.e("Error","Error en la multiplicacion");
        }
    }

    public void Division(View view) {
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 / num2);
            if (ShowResultado != null){
                ShowResultado.setText(Double.toString(resultado));
            }
        }
        catch (Exception e){
            Log.e("Error","Error en la division");
        }

    }

    public void Modulo(View view) {
        String numero1 = num1.getText().toString();
        String numero2 = num2.getText().toString();
        Double num1 = Double.parseDouble(numero1);
        Double num2 = Double.parseDouble(numero2);
        try {
            resultado = (num1 % num2);
            if (ShowResultado != null)
                ShowResultado.setText(Double.toString(resultado));
        }
        catch (Exception e){
            Log.e("Error","Error en el modulo");
        }
    }
}
