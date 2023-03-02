package javademosproject;

public class constructorchainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        childclass cc=new childclass();
//         childclass cc=new childclass(10);
	}

}
class Superclass{
	int x;
	Superclass(){
		System.out.println("no args super class constructor");
	}
	
	Superclass(int x){
		this.x=x;
		System.out.println("One args super class constructor");
	}
}
class childclass extends Superclass{
	childclass(){
		this(10);
		System.out.println("no args child class constructor");
	}
	childclass(int y){
		super(y);
		System.out.println("One args child class constructor");
	}
}