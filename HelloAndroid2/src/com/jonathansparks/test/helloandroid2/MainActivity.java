package com.jonathansparks.test.helloandroid2;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity implements OnClickListener{

	Button myButton;
	TextView myTextView;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        myButton.setOnClickListener(this);
        myButton = (Button) findViewById(R.id.my_button);
        myTextView = (TextView) findViewById(R.id.my_textview);
        		
        
    }


   

	@Override
	public void onClick(View clickedView) {
		
		myTextView.setText("Clicked");
		
	}
    
}
