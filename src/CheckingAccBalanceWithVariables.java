
public class CheckingAccBalanceWithVariables {
	
	static int accbalance=10000;
	
	void withdraw(){
		accbalance =accbalance-2000;
		System.out.println(accbalance);
	}

	public static void main(String[] args) {
		
		CheckingAccBalanceWithVariables hdfc=new CheckingAccBalanceWithVariables();		
		hdfc.withdraw();
		CheckingAccBalanceWithVariables sbi=new CheckingAccBalanceWithVariables();
		sbi.withdraw();

	}

}
