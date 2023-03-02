package javademosproject;
import java.util.*;
import java.util.Scanner;
import java.util.Scanner;

public class sumevennosarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,0,4,5,6,3,0,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
			System.out.println(sum);
		}
	}

}


