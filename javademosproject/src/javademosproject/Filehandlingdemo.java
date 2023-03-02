package javademosproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filehandlingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        fileInputStreamDemo();
		      FileOutputStreamDemo();
	}
static void fileInputStreamDemo() {
	int i;
	File myfile=new File("/Users/asomaraddi/Documents/filehandlingdemo.txt");
	try {
	FileInputStream fis=new FileInputStream(myfile);
	System.out.println("file open");
	while((i=fis.read())!=-1) {
		System.out.print((char) i);
	}
	 fis.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
static void FileOutputStreamDemo() {
	int i;
	File myfile=new File("/Users/asomaraddi/Documents/filehandlingdemo.txt");
	try {
	FileOutputStream fos=new FileOutputStream(myfile);
	System.out.println("file open");
	String data="from the program";
	byte[] dataByteArray=data.getBytes();
	fos.write(dataByteArray);
	
	 fos.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
static void fileReaderDemo() {
	int i;
	File myfile=new File("/Users/asomaraddi/Documents/filehandlingdemo.txt");
	try {
	FileReader fr=new FileReader(myfile);
	System.out.println("file open");
	while((i=fr.read())!=-1) {
		System.out.print((char) i);
	}
	 fr.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
static void FileWriterDemo() {
	int i;
	File myfile=new File("/Users/asomaraddi/Documents/filehandlingdemo.txt");
	try {
	FileWriter fw=new FileWriter(myfile);
	System.out.println("file open");
	fw.write("using file writer to write\n");
	fw.write("one more line");
	
	
	 fw.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
static void bufferedReaderDemo() {
String line;
	File myfile=new File("/Users/asomaraddi/Documents/filehandlingdemo.txt");
	try {
	FileReader fr=new FileReader(myfile);
	BufferedReader br=new BufferedReader(fr);
	System.out.println("file open");
	while((line=br.readLine())!=null) {
		System.out.print(line);
	}
	 fr.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}
