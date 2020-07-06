
public class LoopStatements {

	void whileloop(){
		
		int i=20;
		while(i<=10){
			System.out.println("Arun");
			i++;
		}
	}
	
	
	void dowhile(){
		int i=20;
		do{
		System.out.println("arun");
		i++;
		}while(i<=10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopStatements lo=new LoopStatements();
		lo.whileloop();
		lo.dowhile();

	}

}
