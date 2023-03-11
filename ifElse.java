import java.util.Scanner;
public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner s = new Scanner(System.in);
System.out.println("Enter blue side 1");
int x = s.nextInt();

System.out.println("Enter opposite blue side 2");
int y = s.nextInt();

System.out.println("Enter red side 1 ");
int c = s.nextInt();

System.out.println("Enter opposite red side 2 ");
int b = s.nextInt();

if (x==y & y==b & b==c) {
	System.out.println("This is a square because all sides are congruent but it's also a rectangle. ");
}
else if (x==y & c==b & x!=b & y!=c){
	System.out.println("This just smells like a rectangle.");
}
else {
	System.out.println("We're not going to talk about this one. ");
}
}
	}


