import java.util.Scanner;
public class PowerTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int i = 0;
int powerOfTwo = 1;

while (i<= n) {
	System.out.println(i +""+powerOfTwo);
	powerOfTwo = 2 * powerOfTwo;
	i = i +1;
}
	}

}
