package onecard;

public class Card {
	private int type;
	private int number;
	
	public Card(int type, int number) {
		this.type = type;
		this.number = number;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {

		if (number >= 1 && number <= 13) {
			this.number = number;
		}
	}
}
