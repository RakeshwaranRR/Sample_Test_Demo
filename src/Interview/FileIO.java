package Interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.Reporter;

public class FileIO {
	
	static void m1() throws IOException
	{
		try {
			FileOutputStream fileout=new FileOutputStream("D:\\Data\\Personal\\Interview\\fileOut.txt");
			fileout.write(76);
			//fileout.close();
			System.out.println("Success..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
	}
	}
	
	static void m2() throws IOException
	{
		try {
			FileOutputStream fileout=new FileOutputStream("D:\\Data\\Personal\\Interview\\fileOut.txt");
			String s="Welcome to file IO";
			byte b[]=s.getBytes();
			fileout.write(b);
			fileout.close();
			System.out.println("Success..");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
	}
	}
	static void fileInput() throws IOException
	{
		
		FileInputStream fileIn=new FileInputStream("D:\\Data\\Personal\\Interview\\fileOut.txt");
		int i=fileIn.read();
		System.out.println((char)i);
		fileIn.close();
		
		
	}
	
	public static void main(String args[]) throws IOException
	{
		//m1();
		//m2();
		fileInput();
		
	}

}
