package com.example.ramon.sumacheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResultado;
    RadioButton rdSuma,rdResta,rdMult,rdDiv;
    EditText txtNum1,txtNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNum1 = (EditText) findViewById(R.id.txtN1);
        txtNum2 = (EditText) findViewById(R.id.txtN2);
        txtResultado = (TextView) findViewById(R.id.txtR);
        rdSuma = (RadioButton) findViewById(R.id.rdSuma);
        rdResta = (RadioButton) findViewById(R.id.rdResta);
        rdMult = (RadioButton) findViewById(R.id.rdMult);
        rdDiv = (RadioButton) findViewById(R.id.rdDiv);

    }

    public void opera(View v){
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        if(rdSuma.isChecked()){
            txtResultado.setText(""+(num1+num2));
        }else if(rdResta.isChecked()){
            txtResultado.setText(""+(num1-num2));
        }else if(rdMult.isChecked()){
            txtResultado.setText(""+(num1*num2));
        }else if(rdDiv.isChecked()){
            double n1 = Double.parseDouble(txtNum1.getText().toString());
            double n2 = Double.parseDouble(txtNum2.getText().toString());
            txtResultado.setText(""+(n1/n2));
        }

    }
}
