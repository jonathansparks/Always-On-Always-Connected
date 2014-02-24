package com.jonathansparks.test.cameratest;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.content.Intent;

	public class MainActivity extends Activity {

		final static int CAMERA_RESULT = 0;
		ImageView imv;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i, CAMERA_RESULT);
		}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent){
		super.onActivityResult(requestCode, resultCode, intent);
		if(resultCode == RESULT_OK){
			Bundle extras =  intent.getExtras();
			Bitmap bmp = (Bitmap) extras.get("data");
			
			imv = (ImageView) findViewById(R.id.ReturnedImageView);
			imv.setImageBitmap(bmp);
			
		}
		
	}




}