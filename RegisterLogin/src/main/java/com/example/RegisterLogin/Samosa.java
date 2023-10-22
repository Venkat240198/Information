package com.example.RegisterLogin;

public class Samosa {
	
	private static Samosa samosa;
	
	private Samosa() {
		
	}
	
	//Lazy way singleton design pattern
	public static Samosa getSamosa() {
		if(samosa==null) {
			samosa = new Samosa();
		}
		return samosa;
	}

}
