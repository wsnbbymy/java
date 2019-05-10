package com;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
		Fraction fraction1= new Fraction(2,3);
		Fraction fraction2= new Fraction(3,4);
	    System.out.println(fraction1.toString());
	    System.out.println(fraction2.toString());
	    
	    System.out.println(Fraction.add(fraction1,fraction2));
	    System.out.println(Fraction.mult(fraction1, fraction2));
	    System.out.println(Fraction.sub(fraction1, fraction2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App();
	}

}
