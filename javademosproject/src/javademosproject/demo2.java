package javademosproject;

public class demo2 {

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
