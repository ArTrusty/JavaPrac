
public class InstantLocal {
	public void arielMethod() {
		//Local Variable
		String theVar = "The local variable is declared inside the method of the class.";
		System.out.println(theVar);
	}
	public String theVar="This is my instance variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InstantLocal obj = new InstantLocal();
obj.arielMethod();
System.out.println(obj.theVar);
	}

}
//