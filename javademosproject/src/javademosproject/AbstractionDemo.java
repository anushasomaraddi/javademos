package javademosproject;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BMWThreeSeries b3= new BMWThreeSeries();
         b3.start();
         b3.accelarate();
         
         BMWfiveSeries b5=new BMWfiveSeries();
         b5.start();
         b5.accelarate();
         
//         BMW b=new BMW();
//         b.start();
//         b.accelarate();
	}

}
abstract class BMW{
	void start() {
		System.out.println("BMWstarted");
	}
	abstract void accelarate();
}
class BMWThreeSeries extends BMW{
	void accelarate() {
		System.out.println("3 times accelaration");
	}
}
class BMWfiveSeries extends BMW{
	
	void accelarate() {
		System.out.println("5 times accelaration");
	}
}