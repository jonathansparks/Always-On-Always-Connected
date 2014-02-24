package com.jonathansparks.test.explicitintent;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NotificationCompat.Action;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void goToActivity(View v){
		
		Intent intent = new Intent(this, DetailActivity.class);
		startActivity(intent);
	}
	
	public void implicitViewUrl(View v){
		
		String webpage = "http://www.thurnandtaxismusic.com";
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
		startActivity(intent);
		
	}
	
	public void implicitSendText(View v){
		
		Intent intent = new Intent();
		intent.setAction(Intent.ACTION_SEND);
		intent.putExtra(Intent.EXTRA_TEXT, "Hello, I am an app sending a text");
		intent.setType("text/plain");
		startActivity(intent);
	}
	
	
	

}
	

