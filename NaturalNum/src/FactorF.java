import java.util.Scanner;
public class FactorF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int a;
System.out.print("Enter a number larger than zero:");
		a = in.nextInt();
		long b = a;
		long c = 1;
		while (b>1){
			c = c * b;
			b = b-1;
		}
		System.out.print("Factorial of" +a+ "is:" +c);
	}

}
