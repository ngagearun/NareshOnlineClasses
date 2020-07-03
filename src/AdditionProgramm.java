import java.util.Scanner;


public class AdditionProgramm {
	
	int sum;
	
	int addition(int num1,int num2){
		sum=num1+num2;
		System.out.println(sum);
		return sum;
	}	

	
	public static void main(String[] args) {
		
		AdditionProgramm add=new AdditionProgramm();
	/*	add.addition(100,200);
		add.addition(600, 200);
		add.addition(123, 432);*/
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
	}

}
