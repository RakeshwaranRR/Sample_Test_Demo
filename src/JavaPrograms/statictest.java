package JavaPrograms;
class sstest
{
	static int l=0;
	int x=0;
}

public class statictest 
{
	
	static String s="java";
	static int c=1;
	int d=1;
	static void staticvariablemethod()
	{
		c++;
		System.out.println("Static count is:"+c);
	}
	
	statictest()
	{
		d++;
		System.out.println("Variable count is:"+d);
	}
    

public static void main(String arg[])
{
	
	System.out.println(statictest.s.length());
	System.out.println("Static variale method Start");
	statictest.staticvariablemethod();
	statictest.staticvariablemethod();
	statictest.staticvariablemethod();
	System.out.println("Static variale method End");
	System.out.println("local variale method Start");
	statictest s1=new statictest();
	statictest s2=new statictest();
	statictest s3=new statictest();
	System.out.println("local variale method End");
	//System.out.println(k);
	//c = 20;
	
	

}
}