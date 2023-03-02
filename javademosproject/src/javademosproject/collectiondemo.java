package javademosproject;

import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




	
		demo3();
	}
	private static void demo3() {
		ArrayList<Integer>intlist=new ArrayList<Integer>();
		for(int i=10;i<=100;i++) {
			intlist.add(i);
			
		}
		System.out.println(intlist);
		intlist.add(2,100);
		System.out.println(intlist);
		intlist.add(3, 101);
		intlist.set(4,444);
		intlist.remove(3);
     int value=111;
     if(intlist.contains(value)) {
  	   System.out.println("inlist");
  	   
     }else {
  	   System.out.println("not inlist");
     }
}
}