package com.example.presentationgradle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.presentationgradle.lib1.ClassWiringLib1;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView textView = (TextView) findViewById(R.id.text);
		
		final String text0 = ClassWiring.getTextProvider().getText();
		final String text1 = ClassWiringLib1.getTextProvider().getText();
		
		textView.setText(text0 + "\n" + text1);
	}

}
