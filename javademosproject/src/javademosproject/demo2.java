package javademosproject;

public class demo2 {
        public demo2() {
        	System.out.println("constructor");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("main");
      demo2 dem=new demo2();
      dem.method1();
	}
    static {
    	System.out.println("static");
    }
    {
    	System.out.println("nonstatic");
    }
    public void method1() {
    	System.out.println("method");
    }
}
//private constructors cannot be created outside of the class its the compilation error
//non static variable can be accessed by an instance of a class
//static variable can be accessed with the class name