import java.util.Scanner;
public class CondiPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boxes,price,total,discount;
		Scanner s = new Scanner(System.in);
		System.out.println("We will give you a discount of 10% if the cost of purchased quantity is more than 1000");
		System.out.println("Enter amount of boxes you have purchased ");
		boxes = s.nextInt(); //number of boxes bought
		price = 100;//price per box
		total = boxes * price; //total cost
	double cheap;//I put integer here because I couldn't put it up above
		discount = 0.9; 
		cheap = discount * total;
		
		if (total>=1000) {
			System.out.println("You qualify for a discount your total is"+cheap);
					
		}
		
		else {
			System.out.println("Your total is"+total);
		}
//I tried using an integer but it kept coming up as error so I had to use a different data type.
}
}
