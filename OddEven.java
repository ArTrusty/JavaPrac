import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
double number;
Scanner scan = new Scanner(System.in);
System.out.print("welcome to the Even/Odd genie. Enter any number to know if it's even or odd");
number = scan.nextInt();
if (number % 2 == 0) { //If number has no remainder after being divided by two, it is even 
	System.out.print("This is even");
	
}
	else{
	System.out.println("This is odd");
}

}
}