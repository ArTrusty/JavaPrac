import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter");
		int number = scan.nextInt();
		long factorial = 1;
				for (int i = 1; i <= number; i++) {
					factorial *=i;
				}
				System.out.println(factorial);
	}

}
