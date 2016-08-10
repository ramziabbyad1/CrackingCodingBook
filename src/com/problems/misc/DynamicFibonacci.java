package com.problems.misc;

import java.math.BigInteger;

//First 1000 digit number occurs at i=4782
public class DynamicFibonacci {
	static BigInteger fib[] = new BigInteger[5002];
	//static BigInteger zero
	static BigInteger fibonacci(int i){
		if(i==0)return new BigInteger("0");
		if(i==1)return new BigInteger("1");
		if(fib[i]!=null)return fib[i];
		fib[i] = fibonacci(i-1).add(fibonacci(i-2));
		return fib[i];
	}
	
	public static void main(String[] args) {
		fibonacci(5000);
		//System.out.println(out);
		int counter=0;
		for(BigInteger i:fib)	{
			counter++;
			//System.out.println(i);
			if(i!=null)
			if(i.toString().length()==1000){
				System.out.println("i="+(counter-1));
				break;
			}
		}

	}

}
