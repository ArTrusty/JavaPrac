import java.util.Scanner;
public class NumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);	
		
		int total = 0;
		int num = input.nextInt();
	System.out.println("Enter a value");	
	
	for(int i = 1; i<= num;i++ ) {
	  total += i;

	
	     }
	
		System.out.println("Sum of the first "+num+" natural numbers is: "+total);

	}

}
