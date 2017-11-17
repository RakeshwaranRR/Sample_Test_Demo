import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class FileConcept {
	public static void main(String ag[]) throws IOException
	{
		FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader buffr = null;
		String file="D:\\Data\\FileStringReadTest.txt";
		try {
			
			 fis=new FileInputStream(file);
			 dis=new DataInputStream(fis);
			 buffr=new BufferedReader(new InputStreamReader(dis));
			String line=null;
			System.out.println("The Words Are");
			while((line=buffr.readLine())!=null)
			{ 
				StringTokenizer st=new StringTokenizer(line);
				while(st.hasMoreTokens())
				{
					
					System.out.println(st.nextToken());
				}
				
			}
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
