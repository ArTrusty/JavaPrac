import java.util.Scanner;
public class StairS { public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	int myUser, area;
	System.out.print("How many stairs do you need?");
	myUser = scan.nextInt();
	area = myUser;
	
	for(int i = 0 ; i< myUser; i++) {
		for(int j = area; j>0; j--) {
			System.out.print(" ");
		}
		area--;
		for(int k = 0; k<= i;k++) {
			System.out.print("#");
		}
		System.out.println();
	}
	

}
}
