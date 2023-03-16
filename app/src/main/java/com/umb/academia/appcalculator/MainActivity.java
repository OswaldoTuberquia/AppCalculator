package com.umb.academia.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Num1, Num2;
    private TextView lbResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText)findViewById(R.id.Num1);
        Num2 = (EditText)findViewById(R.id.Num2);
        lbResult = (TextView) findViewById(R.id.lbResult);

        Num1.requestFocus();
        lbResult.setText("0");
    }

    public void opSumar(View view){
        if(!Num1.getText().toString().trim().isEmpty() &&
                !Num2.getText().toString().trim().isEmpty()){
            lbResult.setText(String.valueOf( (Double.parseDouble(Num1.getText().toString().trim()) + Double.parseDouble(Num2.getText().toString().trim())) ));
        }else{
            lbResult.setText("Ingrese Numeros");
        }
    }

    public void opRestar(View view){
        if(!Num1.getText().toString().trim().isEmpty() &&
                !Num2.getText().toString().trim().isEmpty()){
            lbResult.setText(String.valueOf( (Double.parseDouble(Num1.getText().toString().trim()) - Double.parseDouble(Num2.getText().toString().trim())) ));
        }else{
            lbResult.setText("Ingrese Numeros");
        }
    }

    public void opMultiplicar(View view){
        if(!Num1.getText().toString().trim().isEmpty() &&
                !Num2.getText().toString().trim().isEmpty()){
            lbResult.setText(String.valueOf( Double.parseDouble(Num1.getText().toString().trim()) * Double.parseDouble(Num2.getText().toString().trim())) );
        }else{
            lbResult.setText("Ingrese Numeros");
        }
    }

    public void OpDividir(View view){
        if(!Num1.getText().toString().trim().isEmpty() &&
                !Num2.getText().toString().trim().isEmpty()){
            if(Integer.parseInt(Num2.getText().toString().trim()) > 0) {
                lbResult.setText(String.valueOf((Double.parseDouble(Num1.getText().toString().trim()) / Double.parseDouble(Num2.getText().toString().trim()))));
            }else{
                lbResult.setText("División entre cero");
            }
        }else{
            lbResult.setText("Ingrese Numeros");
        }
    }

    public void OpLimpiar(View view){
        Num1.setText("");
        Num2.setText("");
        lbResult.setText("0");
        Num1.requestFocus();
    }


}