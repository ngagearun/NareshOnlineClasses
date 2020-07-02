
public class VariablesInJava {		
	
	//instance variables
	int mobno=200;
	char grade='a';
	//static variables
	static String name ="arun";
	static float pi=3.14f;
	
	
	int a;
	
	//instance method
	void display(){
		a=20;
		System.out.println(a);
		System.out.println(name);
	}
	//static method
	static void show(){
		VariablesInJava var=new VariablesInJava();
		System.out.println(var.mobno);
		System.out.println(name);
		System.out.println(var.a);
	}
	
	//static method
	public static void main(String[] args) {
		//Object creation
		VariablesInJava var=new VariablesInJava();
		System.out.println(var.mobno);
		var.display();
		VariablesInJava.show();
		

	}

}
