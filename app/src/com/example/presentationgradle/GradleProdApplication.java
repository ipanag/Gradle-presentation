package com.example.presentationgradle;

import android.app.Application;

import com.example.presentationgradle.lib1.ClassWiringLib1;

public class GradleProdApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		ClassWiring.setTextProvider(new TextProviderProdImpl());
		ClassWiringLib1.setTextProvider(new com.example.presentationgradle.lib1.TextProviderProdImpl());
	}
}
