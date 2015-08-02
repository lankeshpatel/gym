package com.example.gymapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener {

	private Button workout1;
	private Button workout2;
	private Button workout3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        workout1 = (Button) findViewById(R.id.button1);
		workout2 = (Button) findViewById(R.id.button2);
		workout3 = (Button) findViewById(R.id.button3);

		workout1.setOnClickListener(this);
		workout2.setOnClickListener(this);
		workout3.setOnClickListener(this);
        
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
    
    public void onClick(View v) {
    	Intent pedometerActivity = new Intent(MainActivity.this, pedometer.class);
    	startActivity(pedometerActivity);
    }
}
