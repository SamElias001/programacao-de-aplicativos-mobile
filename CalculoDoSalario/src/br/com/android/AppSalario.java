package br.com.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AppSalario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_salario);
		
		Button btncalcular = (Button) findViewById(R.id.btncalcular);
		
		btncalcular.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				double salario, novo_sal;
				EditText edsalario = (EditText) findViewById(R.id.edsalario);
				salario = Double.parseDouble(edsalario.getText().toString());
				RadioGroup rg = (RadioGroup) findViewById(R.id.rgopcoes);
				
				int op = rg.getCheckedRadioButtonId();
				
				if(op==R.id.rb40)
					novo_sal = salario + (salario * 0.4);
				else
					if(op==R.id.rb45)
						novo_sal = salario + (salario * 0.45);
					else
						novo_sal = salario + (salario * 0.50);
				
				AlertDialog.Builder dialog = new AlertDialog.Builder(AppSalario.this);
					dialog.setTitle("Novo salário");
				
				dialog.setMessage("Seu novo salário é: R$" + String.valueOf(novo_sal));
				dialog.setNeutralButton("OK", null);
				dialog.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_salario, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
