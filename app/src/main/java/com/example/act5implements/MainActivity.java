package com.example.act5implements;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etN1, etN2, etN3;
    private TextView tvMayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        etN3 = findViewById(R.id.etN3);
        tvMayor = findViewById(R.id.tvMayor);

        // Configurar el botón para escuchar los clics
        findViewById(R.id.btnCalcular).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == findViewById(R.id.btnCalcular)) {
            calcularMayor();
        }
    }
    private void calcularMayor() {
        int numero1 = Integer.parseInt(etN1.getText().toString());
        int numero2 = Integer.parseInt(etN2.getText().toString());
        int numero3 = Integer.parseInt(etN3.getText().toString());

        int mayor = Math.max(numero1, Math.max(numero2, numero3));

        tvMayor.setText("El número mayor es: " + mayor);
    }
}