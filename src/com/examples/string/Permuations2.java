package com.examples.string;

public class Permuations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm1("0123456789",10);
	}

	static int count = 0;
	// print N! permutation of the characters of the string s (in order)
    public  static void perm1(String s,int r) { perm1("", s, r); }
    private static void perm1(String prefix, String s, int r) {
        int N = s.length();
        if (r == 0){ count++;System.out.println(prefix+" "+count);if(count==1e6)System.exit(0);}
        else {
            for (int i = 0; i < N; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N),r-1);
        }

    }

}
