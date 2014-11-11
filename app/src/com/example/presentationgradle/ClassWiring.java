package com.example.presentationgradle;

public class ClassWiring {

	private static TextProvider sTextProvider;
	
	public static void setTextProvider(TextProvider textProvider) {
		sTextProvider = textProvider;
	}
	
	public static TextProvider getTextProvider() {
		return sTextProvider;
	}
}
