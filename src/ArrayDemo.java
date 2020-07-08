import java.util.Scanner;


public class ArrayDemo {	
	
	public static void main(String[] args) {
	/*	
	   String countries[]=new String[5];
	   
	   Scanner sc=new Scanner(System.in);
	   for(int i=0;i<5;i++){
		   countries[i]=sc.next();
	   }
	   
	   for(int i=0;i<5;i++){
		   System.out.println( countries[i]);  
	   }  */
	   
	   
	  /* int rollno[]={1001,1002,1003,1004,1005};
	   
	   for(int i=0;i<rollno.length;i++){
		   System.out.println( rollno[i]);  
	   }  
	   */
	   
	   int num[][]={
			   
			   {100,200},
			   {300,400},
			   {400,500}	   
	   };
	   
	   for(int row=0;row<num.length;row++){
		   
		   for(int col=0;col<num[row].length;col++){
			   
			   System.out.println(num[row][col]);
		   }
		   
	   }
	   
	   

	}

}
