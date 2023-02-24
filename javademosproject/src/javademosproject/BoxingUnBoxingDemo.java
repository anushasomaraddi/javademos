package javademosproject;

public class BoxingUnBoxingDemo {
public static void main(String[] args) {
	

	//Wrapper types
	
	int i=10;       //primitive
	Integer a=new Integer(10); //corresponding object representation of the primitives
	byte b=7;
	Byte b1=8;
	
	//Boxing-automatic conversion of primitive to wrapper class
	Integer x=5;
	
	//unBoxing-conversion of wrapper class to primitives is unboxing
	Integer a1=new Integer(50);
	int z=a1;
	System.out.println(z);
	
	Integer y=200;
	if(y>100) {   //internal unboxing where primitive 100 is compared with wrapper class object y by unboxing 
		System.out.println(y);
		
	}
	main();
}

public static void main() {
	System.out.println("fake main");//even though we have written this main jvm looks for exact syntax hence it will not get executeed unless called
}
}