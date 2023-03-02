package javademosproject;

public class Multipleinheritancedemo {
 public static void main(String[] args) {
	TV tv= new TV();
	tv.poweron();
	
	Monitor m=new Monitor();
	m.poweron();
	
 DesktopComputer dc =new DesktopComputer();
 dc.start();
}
}
class ElectronicDevice{
	void poweron() {
		System.out.println("device powered on");
	}
}
class TV extends ElectronicDevice{
	void poweron() {
		System.out.println("TV Screen");
	}
}
class Monitor extends ElectronicDevice{
	void poweron() {
		System.out.println("Black Screen");
	}
}
class DesktopComputer implements I1,I2{
	public void start() {
	I1.super.start();
	I2.super.start();
}
}