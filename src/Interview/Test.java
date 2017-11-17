package Interview;

public class Test { 
	//How to access non static variable in static method

	public static int a=10;
	public static int b=10;
	int c;
	public static void add()
	{
		Test obj=new Test();
		obj.c=a+b;
		System.out.println(obj.c=a+b);
	}
	
	public static void main(String  ar[])
	{
		Test.add();
	}
	
}
