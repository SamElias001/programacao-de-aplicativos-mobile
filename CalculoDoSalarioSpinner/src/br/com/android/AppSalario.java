package br.com.android;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AppSalario extends Activity {
	
	private static final String[] percentual = {"De 40%","De 45%","De 50%"};
	ArrayAdapter<String> aPercentual;
	Spinner spnsal;
	
	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_salario);
		
		Button btmostrar = (Button) findViewById(R.id.btcalcular);
		aPercentual = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, percentual);
		spnsal = (Spinner) findViewById(R.id.spnopcoes);
		spnsal.setAdapter(aPercentual);
		
		btmostrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				double salario = 0, novo_sal = 0;
				EditText edsalario = (EditText) findViewById(R.id.edsalario);
				
				salario = Double.parseDouble(edsalario.getText().toString());
				
				switch(spnsal.getSelectedItemPosition()) {
				case 0: novo_sal = salario + (salario * 0.4); break;
				case 1: novo_sal = salario + (salario * 0.45); break;
				case 2: novo_sal = salario + (salario * 0.5); break;
				}
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(AppSalario.this);
				dialogo.setTitle("Novo salário");
				dialogo.setMessage("Seu novo salário é: R$" + String.valueOf(novo_sal));
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}
		});
	}
}


