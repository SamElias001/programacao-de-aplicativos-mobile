package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculadora extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        
        final EditText vl1 = (EditText) findViewById(R.id.valor1);
        final EditText vl2 = (EditText) findViewById(R.id.valor2);
        final TextView resView = (TextView) findViewById(R.id.resultadoView);
        Button btnSom = (Button) findViewById(R.id.buttonSoma);
        Button btnSub = (Button) findViewById(R.id.buttonSubtrair);
        Button btnDiv = (Button) findViewById(R.id.buttonDividir);
        Button btnMul = (Button) findViewById(R.id.buttonMultiplicar);
        
        btnSom.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				double num1 = Float.parseFloat(vl1.getText().toString());
				double num2 = Float.parseFloat(vl2.getText().toString());
				double res = num1 + num2;
				resView.setText(String.valueOf(res));
			}
		});
        
        btnSub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				double num1 = Float.parseFloat(vl1.getText().toString());
				double num2 = Float.parseFloat(vl2.getText().toString());
				double res = num1 - num2;
				resView.setText(String.valueOf(res));
			}
		});
        
btnDiv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				double num1 = Float.parseFloat(vl1.getText().toString());
				double num2 = Float.parseFloat(vl2.getText().toString());
				double res = num1 / num2;
				resView.setText(String.valueOf(res));
			}
		});
        
        btnMul.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				double num1 = Float.parseFloat(vl1.getText().toString());
				double num2 = Float.parseFloat(vl2.getText().toString());
				double res = num1 * num2;
				resView.setText(String.valueOf(res));
			}
		});
    }
}
