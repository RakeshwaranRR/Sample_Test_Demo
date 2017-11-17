package Parameterization;

import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  @Parameters()
  public void f(String team , String Oppositeteam) {
	  System.out.println("Suite start");
	  if(team.equals("india"))
	  {
		  System.out.println("The next match between "+ team+" vs" +Oppositeteam);
	  }
  }
}
