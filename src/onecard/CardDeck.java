package onecard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	
	static final int SPADE = 0;
	static final int DIA = 1;
	static final int CLOVER = 2;
	static final int HEART = 3;
	
	List<Card> cards = new ArrayList<>();
	
	public CardDeck() {
		for (int type = 0; type < 4; type++) {
			for (int number = 0; number < 13; number++) {
				cards.add(new Card(type, number));
			}
		}
	}
	
	public CardDeck(String jorker) {
		for (int type = 0; type < 4; type++) {
			for (int number = 0; number < 13; number++) {
				cards.add(new Card(type, number));
			}
		}
		// 조커 타입 4, 숫자 0
		cards.add(new Card(4, 0));
	}
	
	public void createCard() {
		
	}
	
	public void shuffle() {
		
		Collections.shuffle(cards);
	}
	
	public static void main(String[] args) {
		CardDeck cDeck = new CardDeck();
		cDeck.shuffle();
		
		for (Card card : cDeck.cards) {
			
			if (card.getNumber()+1 == 1) {
				System.out.print("A");
			} else if (card.getNumber()+1 == 11) {
				System.out.print("J");
			} else if (card.getNumber()+1 == 12) {
				System.out.print("Q");
			} else if (card.getNumber()+1 == 13) {
				System.out.print("K");
			} else {
				System.out.print(card.getNumber());
			}
			
			if (card.getType() == 0) {
				System.out.println("♠");
			} else if (card.getType() == 1) {
				System.out.println("◇");
			} else if (card.getType() == 2) {
				System.out.println("♡");
			} else if (card.getType() == 3) {
				System.out.println("♣");
			} else if (card.getType() == 4) {
				System.out.println("★");
			}
		}
	}

}
