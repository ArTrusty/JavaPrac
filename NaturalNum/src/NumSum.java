import java.util.Scanner;
public class NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num,total;
		num = scan.nextInt();
		total = 0;
		for (int i = 0; i <= num; i++) {
			total = num += i;
		}
		
		System.out.println("Sum of the first"+num+"natural numbers is"+total);
	}

}
