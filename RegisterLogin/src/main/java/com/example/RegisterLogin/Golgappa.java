package com.example.RegisterLogin;

public class Golgappa {
	
	private static Golgappa golgappa;
	
	private Golgappa() {
		
	}
	//Lazy Singleton Design pattern
	public static Golgappa getGolgappa() {
		
		if(golgappa==null) {
			golgappa = new Golgappa();
		}
		return golgappa;
	}

}
