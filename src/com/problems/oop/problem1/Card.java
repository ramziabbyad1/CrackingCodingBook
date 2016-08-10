package com.problems.oop.problem1;

public abstract class Card {
	
	protected Suite suite;
	protected Rank rank;
	public Card(Suite suite, Rank rank){
		this.suite = suite;
		this.rank = rank;
	}
	public Suite getSuite() {
		return suite;
	}
	public abstract int getValue(); 
	@Override
	public String toString() {
		return "Card [suite=" + suite + ", rank=" + rank + "]";
	}
	
}
