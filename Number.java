import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1, num2, num3;
Scanner scan = new Scanner(System.in);
System.out.print("type in three different numbers and we'll tell you which one is the largest");
num1 = scan.nextInt();
System.out.print("Now add your second number");
num2 = scan.nextInt();
System.out.print("Now add your third number");
num3 = scan.nextInt();
if (num1 > num2 && num1 > num3) {
	System.out.print("Wow,your first number was the largest. It was" +num1);
	
}
else if (num2 > num1 && num2 >num3) {
	System.out.print("Wow,your second number was the largest. It was"+num2);
}
else if (num3 > num1 && num3 > num2) {
	System.out.print("Wow,your third number was the largest. It was"+num3);
}
	}

}
