import java.util.Scanner;
public class FacTor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number");
		long number = scan.nextInt();
	long i = 1;
	long total = number;
	
		while (i < number) {
			
			total = number * (number -i);
			
			i++;
				System.out.println(total);
			
		}
	
	}

}
