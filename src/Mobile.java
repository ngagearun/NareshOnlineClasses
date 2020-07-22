
public abstract class Mobile {
	
	abstract void playmusic();
	abstract void cookwithmobile();
	abstract void controlhomeappliances();

}

class Samsung extends Mobile{

	void playmusic(){
		System.out.println("Samsung Playing musci implementation");
	}

	@Override
	void cookwithmobile() {
		System.out.println(" SamsungCooking with mobile implementaion");
		
	}

	@Override
	void controlhomeappliances() {
	
		System.out.println("Samsung Control Home Appliances");
	}
}

class Apple extends Mobile{
	
	void cookwithmobile(){
		System.out.println("Cooking with mobile implementaion");
	}

	@Override
	void playmusic() {
	       System.out.println("Apple play music implementation");
		
	}

	@Override
	void controlhomeappliances() {
		System.out.println("Apple Control Home Appliances");
		
	}
}

 class Redmi extends Mobile{
	
	void controlhomeappliances(){
		System.out.println("Control hom appliances implementation");
		
	}

	@Override
	void playmusic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void cookwithmobile() {
		// TODO Auto-generated method stub
		
	}
}