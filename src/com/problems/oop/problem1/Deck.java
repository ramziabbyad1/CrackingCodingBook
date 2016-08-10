package com.problems.oop.problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Deck<T extends Card> {
	private List<T> deck;
	
	public void setDeck(List<T> deck){
		this.deck = deck;
	}
	
	public List<T> deal(int n) throws Exception{
		List<T> cards = new ArrayList<>();
		if(deck.size() < n){throw new Exception("Out of cards!");}
		for(int i=0;i<n;i++){
			cards.add(deck.remove(0));
		}
		return cards;
	}
	
	public T deal(){return deck.remove(0);}
	
	public void shuffle(){
		int numOfCards = deck.size();
		for(int i=0; i < deck.size(); i++){
			int index = (int)(Math.random()*numOfCards);
			T card = deck.remove(i+index);
			deck.add(0, card);
			numOfCards--;
		}
	}
}
