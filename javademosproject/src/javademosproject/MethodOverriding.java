//package javademosproject;
//
//public class MethodOverriding {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//          carr c=new carr();
//          c.fuel();
//          Bike bike=new Bike();
//          bike.fuel();
//          Bus bus=new Bus();
//          bus.fuel();
//          
//	}
//
//}
//class Vehicle{
//	int a,b;
//	Vehicle(int a, int b){
//		this.a=a;
//		this.b=b;
//	}
//	void fuel() {
//		System.out.println("Petrol");
//	}
//}
//class Bus extends Vehicle{
//	int c,d;
////	Bus(int c,int d){
////		super(0,0);  OR
//	Bus(int a,int b,int c,int d){
//		super(a,b);
//		this.c=c;
//		this.d=d;
//	}
//	void fuel() {
//		super.fuel();
//		System.out.println("Diesel");
//	}
//}
////class carr extends Vehicle{
////	
////}
////class Bike extends Vehicle{
////	
////}