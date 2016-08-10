package com.problems.oop.problem1;

public class BlackJackCard extends Card {

	public BlackJackCard(Suite suite, Rank rank) {
		super(suite, rank);
	}
	
	
	public int[] getRankValue(){
		switch(getRank()){
		case Ace:
			return new int[] {11,1};
		case Eight:
			return new int[] {8};
		case Five:
			return new int[] {5};
		case Four:
			return new int[] {4};
		case Jack:
			return new int[] {11};
		case King:
			break;
		case Nine:
			break;
		case Queen:
			break;
		case Seven:
			break;
		case Six:
			break;
		case Ten:
			break;
		case Three:
			break;
		case Two:
			break;
		default:
			break;
		}
		return null;
	}

}
