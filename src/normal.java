
 abstract class Abstractclass {

	 Abstractclass() {
		System.out.println("Inside Cons");
		
	}
	
	static void m5()
	{
		System.out.println("Static");
	}
	
	void m2()
	{
		System.out.println("Concrete");
	}
	
	abstract void draw();
	
	
	 int m4()
	{
		return 5;
	}

}
public class normal extends Abstractclass
{
	void draw()
	{
		System.out.println("'");
	}
	
	 public static void main(String at[])
	{
		normal obj=new normal();
		obj.m4();
		
		
	}
}
