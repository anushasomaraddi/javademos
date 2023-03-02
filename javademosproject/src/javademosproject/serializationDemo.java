package javademosproject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class serializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Employee emp=new Employee(1,"mark",1500,"AA1002");
//        System.out.println(emp);
//        
        SerializationDemoSimplified();
        DeserializationDemo();
        
       
        }
	 private static void DeserializationDemo() {
     	//try-with block
		 try(FileInputStream fis=new FileInputStream("/Users/asomaraddi/Documents/filehandlingdemo.txt");
				 ObjectInputStream ois=new ObjectInputStream(fis);)	{
			 Employee emp=(Employee) ois.readObject();
			 System.out.println("object Deserialized -"+emp);
		 
		 }catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }catch(IOException e){
			 e.printStackTrace();
			 
		 }catch(ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 
	 
	 }
	 
//	 private static void SerializationDemo() {
		 private static void SerializationDemoSimplified() {
			 //try-with block
			 try(FileOutputStream fos=new FileOutputStream("/Users/asomaraddi/Documents/filehandlingdemo.txt");
					 ObjectOutputStream oos=new ObjectOutputStream(fos);)	{
				Employee emp=new Employee(1,"max",8000,"AAAdd");
				oos.writeObject(emp);
				System.out.println("Object Serializable");
			 
			 }catch(FileNotFoundException e) {
				 e.printStackTrace();
			 }catch(IOException e){
				 e.printStackTrace();
				 
			 }
			 
		
	 }
 }

class Employee implements Serializable{
	int id;
	String name;
	double salary;
	
	transient String adharno;
	Employee(int id,String name,double salary,String aadharno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.adharno=aadharno;
	}
	public String toString() {
		return this.id+""+this.name+""+this.salary+""+this.adharno;
	}
	}
//inorder to not allow the data to be accessed use transient
