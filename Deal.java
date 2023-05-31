 import java.util.Scanner;
//import java.util.Random;
public class Deal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int CARDS_PER_PLAYER = 5;
// cards total is players * 5
        // number of players
		System.out.println("Enter number of players");
		Scanner s = new Scanner(System.in);
        int PLAYERS = s.nextInt();
        		//Integer.parseInt(args[0]);

        String[] SUITS = 
        {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = 
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };
        
int number_of_cards_total = PLAYERS * 5; 
  	int n = SUITS.length * RANKS.length;
  //	Random Deck = new Random (n);
  	
 	if (number_of_cards_total > n)
         throw new RuntimeException("Too many players");
//for (SUITS < number_of_cards_total ) {
//	System.out.print(SUITS.length * RANKS.length);
	

            
    //initialize deck
    
    //shuffle deck
    
    //print shuffled deck
    
	}

}
