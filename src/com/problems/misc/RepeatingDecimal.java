package com.problems.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RepeatingDecimal {

	public static void main(String[] args) {
		double a = 1.0;
		double b = 33.0;
		double num = a/b;
		System.out.println(num);
		int head = (int)a/(int)b;
		num = num - head;
		Double x = (Double)num;
		//System.out.println(x);
		char[] charc = x.toString().toCharArray();
		//List<Character> input = getList(charc);
		List<Character> ans = getTrunc(charc);
		for(char c: ans){
			System.out.print(c);
		}

	}
	
	/*public static List<Character> getList(char[] charc){
		List<Character> out = new ArrayList()<>();
		char current
	}*/
	
	public static List<Character> getTrunc(char[] decm){
		List<Character> out = new ArrayList<>();
		boolean keepGoing = true;
		int i = 2;
		out.add(decm[i]);
		i = 3;
		while(keepGoing && i < decm.length){
			char next = decm[i];
			if(out.contains(next)){
				int index = out.indexOf(next);
				out.add(index, '(');
				out.add(')');
				break;
			}else{
				out.add(decm[i]);
			}
			i++;
		}
		
		return out;
	}
	
}
