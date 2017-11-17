
public interface LaunchBrowser 
{
	public void browser();
	
}

interface LL1
{
	void add();
}

interface ll2
{
	void del();
}
interface ll3 extends ll2,LL1,LaunchBrowser
{
	void mul();
}