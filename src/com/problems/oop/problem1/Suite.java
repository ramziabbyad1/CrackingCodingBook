package com.problems.oop.problem1;

public enum Suite{
	Hearts(0), Diamonds(1), Clubs(2), Spades(3);
	private int value;
	private Suite(int value){this.value=value;}
	public int getValue(){return value;}
	public static Suite getSuiteFromValue(int value){
		switch (value) {
			case 0:
				return Hearts;
			case 1:
				return Diamonds;
			case 2:
				return Clubs;
			case 3:
				return Spades;
			default:
				return null;
		}
		
	}
}
