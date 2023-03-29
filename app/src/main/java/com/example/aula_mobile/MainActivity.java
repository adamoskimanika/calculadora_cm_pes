package com.example.aula_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        TextView txt_Altura = (TextView) findViewById(R.id.txt_altura);
        final TextView txtResultado = (TextView) findViewById(R.id.txt_resultado);
        EditText edt_Altura = findViewById(R.id.edt_altura);
        Button btn_Calcular = findViewById(R.id.btn_calcular);

        btn_Calcular.setOnClickListener (new View.OnClickListener()
    {

        @Override
        public void onClick(View view) {
            int altura = 0;
            float pes = 30.48f;
            float resultado = 0.00f;
            String result = "";

            altura = Integer.parseInt(edt_Altura.getText().toString());
            resultado = (altura/pes);

            result = String.format("%.3f", resultado);


            if(altura ==0) {
                txtResultado.setText("Informe uma altura maior que ZERO");
            } else {


                    txtResultado.setText("O valor " +altura +" cm em pés é: " +result);

                }


            }

           });








    }
}