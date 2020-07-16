
class Vehicle {
	
	int speed;
	
	int calculatespeed(int hr){
		
		return  speed*hr;
	}

}


class  Car1 extends Vehicle{
	
int calculatespeed(int hr){
		
		return  speed*hr;
	}
	
	
	
	public static void main(String[] args){
		
		Car1 bmw=new Car1();
		bmw.speed=100;
		System.out.println(bmw.calculatespeed(10));
		
		
	}
	
}
