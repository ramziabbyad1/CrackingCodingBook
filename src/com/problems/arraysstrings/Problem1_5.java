package com.problems.arraysstrings;

public class Problem1_5 {

	public static void main(String[] args) {
		String input = "abcndkaabbbbascdddd";
		String out = compress(input);
		System.out.println(out);
	}
	
	public static String compress(String input){
		StringBuffer sb = new StringBuffer();
		int len = input.length();
		int start = 0;
		int i = 0;
		while(i < len-1){
			int count = 1;
			start = i;
			if(input.charAt(i)== input.charAt(i+1)){
				count++;
				int j = i+2;
				if(start == 0){sb.append(input.substring(0,i));}
				while(j < len && input.charAt(i)==input.charAt(j)){
					count++;
					j++;
				}
				
				sb.append(input.charAt(i));
				sb.append(count);
				start++;
				
			}else if(i == len-2 && start!=0){
				sb.append(input.charAt(len-1));
			}else if(start!=0){
				sb.append(input.charAt(i));
			}
			i += count;
		}
		if(sb.length()==0){
			return input;
		}
		return sb.toString();	
		
	}

}
