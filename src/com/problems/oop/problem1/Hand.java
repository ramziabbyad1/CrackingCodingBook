package com.problems.oop.problem1;

import java.util.ArrayList;
import java.util.List;

public class Hand<T extends Card> {
	protected List<T> hand = new ArrayList<>();
	
	public void addCards(List<T> cards){
		hand.addAll(cards);
	}
	public void addCard(T card){
		hand.add(card);
	}
	public void returnHand(){
		hand.clear();
	}
	
}
