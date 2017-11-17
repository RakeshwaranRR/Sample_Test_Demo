package JavaPrograms.Collection_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

class Test {
	
	public void FileRead(String filepath) throws IOException
	{

		FileInputStream fis=new FileInputStream(filepath);
		//BufferedReader bff=new BufferedReader(fis);
		String text=IOUtils.toString(fis);
		String words[]=text.split(" ");
		TreeSet<String> tree=new TreeSet<>();
		for(int i=0;i<words.length;i++)
		{
			tree.add(words[i]);
		}
		System.out.println("The words are");
		for(String d:tree)
		{
			System.out.print(d+", ");
		}
		
		
	}
	
	public void FileReadUsingCollections(String filepath) throws IOException
	{
		File file=new File(filepath);
		List<String> list=FileUtils.readLines(file);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
	public void readAndWriteSortedText(String filepath) throws IOException
	{
		FileReader fr=new FileReader(filepath);
		BufferedReader bffr=new BufferedReader(fr);
		String currentLine=bffr.readLine();
		ArrayList<String> lines = new ArrayList<String>();
		while(currentLine!=null)
		{
			lines.add(currentLine);
			currentLine=bffr.readLine();
		}
		System.out.println(lines);
		Collections.sort(lines);
		System.out.println(lines);
		FileWriter FW=new FileWriter("D:\\Data\\Personal\\RakeshTestingProject\\Sample_Test_Demo\\Sample_output.txt");
		BufferedWriter bw=new BufferedWriter(FW);
		for(String zz:lines)
		{
			bw.write(zz);
			bw.newLine();
		}
		System.out.println(lines);
		
		if (bffr != null)
        {
			bffr.close();
        }
         
        if(bw != null)
        {
        	bw.close();
        }
	}
	

}

public class FileReadAndTextSort extends Test
{
	public static void main(String ag[]) throws IOException
	{
		FileReadAndTextSort tt=new FileReadAndTextSort();
		//tt.FileRead("D:\\Data\\Personal\\RakeshTestingProject\\Sample_Test_Demo\\Sample.txt");
		tt.readAndWriteSortedText("D:\\Data\\Personal\\RakeshTestingProject\\Sample_Test_Demo\\Sample.txt");
	}
}
