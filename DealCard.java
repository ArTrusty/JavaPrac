import java.util.Scanner;
public class DealCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of players >0");
		int CARDS_PER_PLAYER = scan.nextInt();
		
        // number of players
		System.out.println("Choose number of card/player");
        int PLAYERS = scan.nextInt();

        String[] SUITS = 
        {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = 
        {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        
        
  	int n = SUITS.length * RANKS.length;
  	
  	 if (CARDS_PER_PLAYER * PLAYERS > n)
            throw new RuntimeException("Too many players");
  	 
    String [] deck  = new String [RANKS.length * SUITS.length];
  	for (int i=0; i<RANKS.length;i++) {
  		for (int j=0; j<SUITS.length;j++) {
  			deck [SUITS.length * i +j]= RANKS[i] + "of" + SUITS[j];}
  	}
  	//shuffle 
  	for (int i=0; i<n; i++) {
  		int r = i + (int)(Math.random()* (n-i));
  		String temp = deck [r];
  		deck [r] =deck [i];
  		deck [i] =temp;
  	}
  	
  	
 
   for (int i=0; i<PLAYERS*CARDS_PER_PLAYER; i++) {
	   System.out.println(deck[i]);
	   if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
		   System.out.println();
		   
   }         
   
    
    
	}

}
