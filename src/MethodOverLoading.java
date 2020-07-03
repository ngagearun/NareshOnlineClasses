
public class MethodOverLoading {
	
	static int sum;
	
	void addition(int num1,int num2){
	
		 sum=num1+num2;
		System.out.println(sum);
	}
	
	void addition(int num1,int num2,int num3){
		
		sum=num1+num2+num3;
		System.out.println(sum);
	}
	
	void addition(int num1,int num2,int num3,int num4){
	
		sum=num1+num2+num3+num4;
		System.out.println(sum);
	}
	
	void addition(float num1,float num2){
		sum=(int) (num1+num2);
		System.out.println(sum);
	}
	

	public static void main(String[] args) {
		
		MethodOverLoading method=new MethodOverLoading();
		method.addition(200, 300);
		method.addition(243.f, 123.5f);

	}

}
