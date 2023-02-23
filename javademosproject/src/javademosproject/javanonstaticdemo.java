package javademosproject;

public class javanonstaticdemo {
 public javanonstaticdemo() {
	 System.out.println("from constructor ");
 }
 {
	 System.out.println("from nonstatic block1 ");
	 } 
 
 public static void main(String[]args) {
	 System.out.println("From main method");
	 javanonstaticdemo jnsd=new javanonstaticdemo();
	 
 
 }

}
