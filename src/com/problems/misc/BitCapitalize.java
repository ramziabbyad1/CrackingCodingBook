package com.problems.misc;

public class BitCapitalize {
	
	public static String reverseString(String s){
		StringBuffer sb = new StringBuffer();
		int N = s.length();
		for(int i = 0; i < N; i++){
			sb.append(s.charAt(N-i-1));
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String word = "abcdef";
		int N = word.length();
		 
		for(int i = 0; i <= Math.pow(2, N)-1; i++){
			//Integer index = i;
			String bits = Integer.toBinaryString(i);
			bits = reverseString(bits);
			System.out.println(bits);
			for(int j = 0; j < N; j++){
				if(j < bits.length()){
					char c = bits.charAt(j);
					if(c == '1'){
						System.out.print(Character.toUpperCase(word.charAt(j)));
					}else{
						System.out.print(word.charAt(j));
					}
				}else{
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
