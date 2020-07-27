
public class ExceptionHandling {

	
	void div(){
		try{
		int division=200/5;
		System.out.println(division);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	void display(){
	System.out.println("I am in display method");	
	}
	
	
	public static void main(String[] args) {
		ExceptionHandling ex=new ExceptionHandling();
		ex.div();
		ex.display();

	}

}
