package com.problems.misc;

public class ConvertToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 40;
		int b = 16;
		int gcd = gcd(b,a);
		int lcm = lcm(a,b);
		System.out.println("GCD of "+a +" and " + b);
		System.out.println("= " + gcd);
		System.out.println("LCM of "+a +" and " + b);
		System.out.println("= " + lcm);
		Fraction f = convertDecimal(.75);
		System.out.println("Fraction = "+f);
	}
	static class Fraction{
		int num;
		int denom;
		Fraction(int num, int denom){
			this.num=num;
			this.denom=denom;
			
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return num+"/"+denom;
		}
	}
	static Fraction convertDecimal(double x){
		double numerator,denominator;
		numerator=x;
		denominator = 1;
		while(Math.floor(numerator)!= numerator){
			numerator *=10;
			denominator *=10;
		}
		int num = (int)numerator;
		int den = (int)denominator;
		int gcd = gcd(num,den);
		num /= gcd;
		den /= gcd;
		Fraction f = new Fraction(num,den);
		return f;
	}
	
	static int gcd(int a, int b){
		int r = 1;
		int temp;
		if(a < b){
			temp = a;
			a = b;
			b=temp;
		}
		while(r!=0){
			r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

	static int lcm(int a, int b){
		int gcd = gcd(a,b);
		int lcm = (a*b)/gcd;
		return lcm;
	}
}
