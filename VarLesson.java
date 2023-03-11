
public class VarLesson {
String VariableLesson="This is my homework";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VarLesson obj = new VarLesson();
VarLesson obj2 = new VarLesson();
System.out.println(obj.VariableLesson);
System.out.println(obj2.VariableLesson);
System.out.println(obj.VariableLesson);
obj2.VariableLesson = "This homework is fun";
System.out.println(obj2.VariableLesson);
	}

}
