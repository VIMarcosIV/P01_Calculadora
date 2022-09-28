package org.iesch.p01_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.iesch.p01_calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        EditText primerNumero = binding.ETprimerValor;
        EditText segundoNumero = binding.ETsegundoValor;
        TextView resultado = binding.TVResultado;

        binding.btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!primerNumero.getText().toString().isEmpty() && !segundoNumero.getText().toString().isEmpty()) {
                    double primerNum = Double.parseDouble(primerNumero.getText().toString());
                    double segundoNum = Double.parseDouble(segundoNumero.getText().toString());
                    resultado.setText(Double.toString(primerNum + segundoNum));
                } else {
                    Toast.makeText(MainActivity.this, "Introduce los valores con los que vas a operar", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!primerNumero.getText().toString().isEmpty() && !segundoNumero.getText().toString().isEmpty()) {
                    double primerNum = Double.parseDouble(primerNumero.getText().toString());
                    double segundoNum = Double.parseDouble(segundoNumero.getText().toString());
                    resultado.setText(Double.toString(primerNum - segundoNum));
                } else {
                    Toast.makeText(MainActivity.this, "Introduce los valores con los que vas a operar", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!primerNumero.getText().toString().isEmpty() && !segundoNumero.getText().toString().isEmpty()) {
                    double primerNum = Double.parseDouble(primerNumero.getText().toString());
                    double segundoNum = Double.parseDouble(segundoNumero.getText().toString());
                    resultado.setText(Double.toString(primerNum * segundoNum));
                } else {
                    Toast.makeText(MainActivity.this, R.string.Toast, Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!primerNumero.getText().toString().isEmpty() && !segundoNumero.getText().toString().isEmpty()) {
                    double primerNum = Double.parseDouble(primerNumero.getText().toString());
                    double segundoNum = Double.parseDouble(segundoNumero.getText().toString());
                    resultado.setText(Double.toString(primerNum / segundoNum));
                } else {
                    Toast.makeText(MainActivity.this, R.string.Toast, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}