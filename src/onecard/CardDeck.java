package onecard;

import java.util.ArrayList;

public class CardDeck {
	
	static final int SPADE = 0;
	static final int DIA = 1;
	static final int CLOVER = 2;
	static final int HEART = 3;
	
	ArrayList<Card> cards = new ArrayList<>();
	
	public CardDeck() {
		for (int i = 0; i < 13; i++) {
			
		}
	}
	
	public void createCard() {
		for (int i = 0; i < 13; i++) {
			
		}
		
	}
	
	public static void main(String[] args) {
		CardDeck cDeck = new CardDeck();
		cDeck.createCard();
		
		for (Card card : cDeck.cards) {
			
			if (card.getNumber() == 1) {
				System.out.print("A");
			} else if (card.getNumber() == 11) {
				System.out.print("J");
			} else if (card.getNumber() == 12) {
				System.out.print("Q");
			} else if (card.getNumber() == 13) {
				System.out.print("K");
			} else {
				System.out.print(card.getNumber());
			}
			System.out.println(card.getType());
		}
	}

}
