package edu.continental.session2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;


public class Pantalla3 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla3);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla3, menu);
		return true;
	}

}
