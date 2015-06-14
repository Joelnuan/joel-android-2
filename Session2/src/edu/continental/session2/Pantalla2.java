package edu.continental.session2;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pantalla2 extends Activity implements android.view.View.OnClickListener{
	
	//Declarando Objetos 
	EditText txtTalla;
	EditText txtPeso;
	Button btnProcesar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla2);
		
		//Asignando valor a los objetos
		txtTalla = (EditText)findViewById (R.id.inputTalla);
		txtPeso=(EditText) findViewById(R.id.inputPeso);
		btnProcesar=(Button) findViewById(R.id.btnProcesar);
		
		btnProcesar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla2, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		// TODO Auto-generated method stub
		
		//Si le hizo click al boton Procesar
		if (v==btnProcesar){
			Double talla=Double.parseDouble(txtTalla.getText().toString());
			Double peso=Double.parseDouble(txtPeso.getText().toString());
			
			//Double imc=peso/(talla*talla);
			Double imc=(peso/(Math.pow(talla,2)));
			DecimalFormat res=new DecimalFormat("###.##");
			
			if (imc<18.5){
				Toast.makeText(this, "El resultado es: "+res.format(imc)+" y su estado es INFRAPESO",Toast.LENGTH_SHORT).show();
			}
			else if ((imc>=18.5)&&(imc<=24.99)){
				Toast.makeText(this, "El resultado es: "+res.format(imc)+" y su estado es NORMAL",Toast.LENGTH_SHORT).show();
			}
			else if ((imc>=25)&&(imc<=29.99)){
				Toast.makeText(this, "El resultado es: "+res.format(imc)+" y su estado es SOBREPESO",Toast.LENGTH_SHORT).show();
			}
			else
				{
					Toast.makeText(this, "El resultado es: "+res.format(imc)+" y su estado es OBESO",Toast.LENGTH_SHORT).show();
				}
			
			
		}
	}
	
	
	
	
	

}
