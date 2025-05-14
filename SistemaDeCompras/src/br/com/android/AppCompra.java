package br.com.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AppCompra extends Activity {
	CheckBox chkarroz,chkleite,chkcarne,chkfeijao;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_compra);
		
		chkarroz = (CheckBox) findViewById(R.id.chkarroz);
		chkleite = (CheckBox) findViewById(R.id.chkleite);
		chkcarne = (CheckBox) findViewById(R.id.chkcarne);
		chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
		Button btntotal = (Button) findViewById(R.id.btntotal);
		
		btntotal.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				
				double total = 0;
				
				if(chkarroz.isChecked())
					total += 2.69;
				
				if(chkarroz.isChecked())
					total += 5.00;
				
				if(chkarroz.isChecked())
					total += 9.7;
				
				if(chkarroz.isChecked())
					total += 2.30;
				
				AlertDialog.Builder dialogo = new AlertDialog.Builder(AppCompra.this);
				dialogo.setTitle("Aviso");
				dialogo.setMessage("Valor total da compra: " + String.valueOf(total));
				dialogo.setNeutralButton("OK",null);
				dialogo.show();
			}
		});
	}
}
