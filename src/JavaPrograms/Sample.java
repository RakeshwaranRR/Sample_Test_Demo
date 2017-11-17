package JavaPrograms;

public class Sample{
	int i=0;
void ss()
{
System.out.println("Sample Program1");
do
{

System.out.println("values:"+i);
i++;
}while(i<=10);
}

void stringfunction()
{
	String a[]={"ONE","TWO"};
	String b[]={"ONEONE","TWOTWO"};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.println("a:"+a[i]+" b:"+b[i]);
			break;
		}
	}
}
void arrays()
{
	String a="Samp;le";
	String abc[]=a.split(";");
	for(int i=0;i<abc.length;i++)
	{
		System.out.println("Arrays after split:"+abc[i]+"loop2"+abc[i+1]);
		
	}
	
}

public static void main(String args[])
{
 Sample sss=new Sample();
 //sss.stringfunction();
 sss.arrays();
}


}