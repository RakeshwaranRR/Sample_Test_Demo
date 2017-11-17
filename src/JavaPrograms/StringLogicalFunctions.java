package JavaPrograms;

public class StringLogicalFunctions 

{
	public void StringReverse()
	{
		String cc="";
		String dd="This is going to perform string word reverse operations";
		String swr[]=dd.split(" ");
		int sentencelength=swr.length;
		for(int i=sentencelength-1;i>=0;i--)
		{
			cc=cc+swr[i]+" ";
		}
		System.out.println("Sentence reverse is :"+ cc);
	}
 
	public void WordReverse()
	{
		String cc1="";
		String dd1="word reverse";
	
		for(int i=dd1.length()-1;i>=0;i--)
		{
			cc1=cc1+dd1.charAt(i);
		}
		System.out.println("Word reverse is :"+ cc1);
	}

	public void StringLogicalFunctions()
	{
		String cc2="";
		String dd2="Perform both word and sentence reverse";
		String ss[]=dd2.split(" ");
	for (int j=0;j<ss.length;j++)
	{
		String ff1=ss[j];
	
		for(int i=ff1.length()-1;i>=0;i--)
		{
			cc2=cc2+ff1.charAt(i);
		}
		cc2=cc2+" ";
	}
	System.out.println("Letter reverse is :"+ cc2);
	}

public static void main(String args[])
{
	StringLogicalFunctions ff=new StringLogicalFunctions();
	
}

}