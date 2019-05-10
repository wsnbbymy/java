package Card;

public class App {

	public App() {
		String []SUITCASE = {"红桃","黑桃","方片","草花"};
		String []NUMBER = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

		Card []deck = new Card[52];
		for(int i = 0; i < deck.length; i++){
			Card tmp = new Card(SUITCASE[i/13],NUMBER[i%13]);
			deck[i] = tmp;	
		}
		for(int i = 0; i < deck.length; i++){

			int index = (int) (Math.random() * 52);

			Card temp_card = deck[i];
			deck[i] = deck[index];
			deck[index] = temp_card;
		}
		Card []person1 = new Card[13];
		Card []person2 = new Card[13];
		Card []person3 = new Card[13];
		Card []person4 = new Card[13];
		
		for(int i = 0; i < deck.length;i=i+4){
			person4[i / 4] = deck[i];
			person1[i / 4] = deck[i+1];
			person2[i / 4] = deck[i+2];
			person3[i / 4] = deck[i+3];		
		}
		for(Card card:person1){
			System.out.println(card.toString());
		}
		System.out.println();
		for(Card card:person2){
			System.out.println(card.toString());
		}
		System.out.println();
		for(Card card:person3){
			System.out.println(card.toString());
		}
		System.out.println();
		for(Card card:person4){
			System.out.println(card.toString());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App();
	}

}
