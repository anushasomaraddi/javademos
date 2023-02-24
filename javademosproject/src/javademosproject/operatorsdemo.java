package javademosproject;

public class operatorsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=5;
		//unary operators
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		System.out.println(a++);//Increment happens after executing statement(printing)
		
		System.out.println(a);
		System.out.println(++a);//Increment happens before executing statement
		
		boolean isSelected=false;
		if(!isSelected) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		//Relational operators <,>,!=
		//logical  == && ||
		//Arithmetic + - % / *
		//assignment operators p-=3;
		int p=4;
		int q=5;
		int res=(p<q)?p:q;
		System.out.println(res);
		}
       
}

