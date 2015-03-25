package com.cutonala.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private EditText numero1;
	private EditText numero2;
    private EditText taza;
	private EditText resultado;

	private Button btnSuma;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//this.resultado= (TextView) findViewById(R.id.etiqueta);

        //this.resultado= (EditText) findViewById(R.id.resultado);
        this.taza= (EditText) findViewById(R.id.taza);
		this.numero1= (EditText) findViewById(R.id.pesos);
		this.numero2= (EditText) findViewById(R.id.dolares);
		

		//this.btnSuma= (Button) findViewById(R.id.btnSuma);

	}


    public void OnClickCaja1(View v){
        Double pesos, dolares, cambio;

        pesos = Double.parseDouble(numero1.getText().toString());
        cambio = Double.parseDouble(taza.getText().toString());
        dolares = pesos / cambio;

        numero2.setText(Double.toString(dolares));
    }

    public void OnClickCaja2(View v){
        Double pesos, dolares, cambio;

        dolares = Double.parseDouble(numero2.getText().toString());
        cambio = Double.parseDouble(taza.getText().toString());
        pesos = dolares * cambio;

        numero1.setText(Double.toString(pesos));
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
