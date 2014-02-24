package com.jonathansparks.testcatify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class pickCat extends Activity {
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_cat);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.take_photo, menu);
	return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			finish();
		}
		return super.onOptionsItemSelected(item);
	}

public void goToConfirmCatifyActivity(View v){
		
		Intent intentConfirmCatify= new Intent(this, ConfirmCatify.class);
		startActivity(intentConfirmCatify);
	}

}
