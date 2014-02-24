package org.example.androidsdk.demo;

import java.util.List;

import org.example.androidsdk.demo.data.Flower;
import org.example.androidsdk.demo.data.FlowerData;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@SuppressWarnings("unused")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<Flower> flowers = new FlowerData().getFlowers();
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
		
	}
	
}
