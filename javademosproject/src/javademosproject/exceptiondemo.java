package javademosproject;
import java.util.Scanner;
public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //dividebyzerodemo();
      stringParserDemo();
      nullPointerDemo();
	}
	private static void stringParserDemo() {
		String s="hello";
		try {
		int i=Integer.parseInt(s);
		System.out.println("Converted integer="+i);
		}catch(NumberFormatException e) {
			System.out.println("exception occured"+e);
		}
				
	}
	private static void nullPointerDemo() {
		
		String s=null;
		try {
		System.out.println("length of my string="+s.length());
		}catch(NullPointerException e){
			System.out.println("exception occured"+e);
			
		}
	}

	private static void dividebyzerodemo() {
		int a,b;
		  float c,d;
		  System.out.println("Enter nos to divide");
		  Scanner s=new Scanner(System.in);
		  a=s.nextInt();
		  System.out.println("the first no inputted is"+a);
		  System.out.println("Enter one more no");
		  b=s.nextInt();
		  System.out.println("the sec no inputted is"+b);
		  try {
			  c=a/b;
			  d=a%b;
			  System.out.println("C is"+c);
			  System.out.println("D is"+d);
			  
		  }catch(ArithmeticException e) {
			  System.out.println("Exception occured."+e.getMessage());
		  }
	}

	
	
	

}
