package javademosproject;
import java.util.*;
import java.util.Scanner;
public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
       int arr[] =new int[10];
       System.out.println("enter the no of array elements");
       int n=sc.nextInt();
       System.out.println("enter the array elements");
       for(i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
       }
       for(i=0;i<n;i++) {
    	   if(arr[i]==3 && arr[i+1]==5) {
        	   arr[i+1]=0;
        	  
           }
    	  
       }
       for( i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
