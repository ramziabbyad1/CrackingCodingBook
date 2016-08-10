package com.examples.string;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		List<StringBuffer> list = permutationsOf(sb);
		System.out.println(list);

	}

	public static List<StringBuffer> permutationsOf(StringBuffer sb){
		List<StringBuffer> list = new ArrayList<>();
		if(sb.length()==1){
			list.add(sb);
			return list;
		}
		char c = sb.charAt(0);
		sb.deleteCharAt(0);
		list = permutationsOf(sb);
		//System.out.println(list);
		List<StringBuffer> list2 = new ArrayList<>();
		for(int i = 0; i < list.size(); i++){
			StringBuffer ithelem = list.get(i);
			for(int j = 0; j < ithelem.length()+1; j++){
				StringBuffer in = new StringBuffer(ithelem.insert(j, c));
				list2.add(in);
				ithelem.deleteCharAt(j);
			}
		}
		return list2;
	}
}
