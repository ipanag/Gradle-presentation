package com.example.presentationgradle.lib1;

public class ClassWiringLib1 {

	private static TextProvider sTextProvider;
	
	public static void setTextProvider(TextProvider textProvider) {
		sTextProvider = textProvider;
	}
	
	public static TextProvider getTextProvider() {
		return sTextProvider;
	}
}
