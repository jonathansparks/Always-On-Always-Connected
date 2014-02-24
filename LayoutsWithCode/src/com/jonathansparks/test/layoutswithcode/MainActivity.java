package com.jonathansparks.test.layoutswithcode;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        
        for (int i = 0; i < 3; i++) {
            Button button = new Button(this);
            button.setText(R.string.click_me);
            
            layout.addView(button);
		} 

        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
