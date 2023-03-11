import java.util.Scanner;
public class YearLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double Lyear;
		System.out.print("Enter year and we'll check if it's a leap");
		Lyear = scan.nextInt();
		if (Lyear % 4 == 0) {
			System.out.print(" This is a leap year!");
		}
		else if (Lyear % 400 == 0) {
			System.out.print(" This is a leap year!");
		}
		else {
			System.out.print(" This is not a leap year!");
		}
	}

}
