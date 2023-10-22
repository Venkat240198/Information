package com.example.RegisterLogin;

public class Test2 {
	
	public static void main(String[] args) {
		
		Golgappa golgappa1 = Golgappa.getGolgappa();
		System.out.println(golgappa1.hashCode());
		Golgappa golgappa2 = Golgappa.getGolgappa();
		System.out.println(golgappa2.hashCode());
		System.out.println(Tostea.getTostea().hashCode());
		System.out.println(Tostea.getTostea().hashCode());
	}

}
