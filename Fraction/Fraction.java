package com;

public class Fraction 
{
	private  int fenz,fenm;
	public Fraction(int fenz, int fenm) {
		super();
		this.fenz = fenz;
		this.fenm = fenm;
	}
	
	
	
	@Override
	public String toString() {
		return "Fraction [fenz=" + fenz + ", fenm=" + fenm + "]";
	}



	static public String add(Fraction f1,Fraction f2)
	{
		int fenzi;
		int fenmu;
		fenzi = f1.fenz*f2.fenm+f1.fenm*f2.fenz;
		fenmu = f1.fenm*f2.fenm;
		return fenzi+"/"+fenmu;
	}
	static public String mult(Fraction f1,Fraction f2)
	{
		
		return (f1.fenz*f2.fenz) + "/" + (f1.fenm*f2.fenm);
	}
	
	static public String sub(Fraction f1, Fraction f2)
	{
		return (f1.fenz*f2.fenm)-(f1.fenm*f2.fenz)+ "/" + (f1.fenm*f2.fenm);
	}

}
