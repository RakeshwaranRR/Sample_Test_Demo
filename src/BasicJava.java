import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class BasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcd";
	    String s2 = "bcd";
	    String s3 = s1+"\n"+s2;
	    System.out.println(s3);
	      Date date = new Date();
	      String strDateFormat = "M/d/yyyy HH:mm a";
	      String strDateFormat1 = "HH:mm a";
	      String strDateFormat2 = "HH";
	      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	      SimpleDateFormat sdf1 = new SimpleDateFormat(strDateFormat1);
	      SimpleDateFormat sdf2 = new SimpleDateFormat(strDateFormat2);
	      
	      String DD=sdf.format(date);
	      String DD1=sdf1.format(date);
	      String DD2=sdf2.format(date);
	     // System.out.println(sdf.format(date));
	      System.out.println(DD);
	      System.out.println(DD1);
	      System.out.println(DD2);
	      
	    int year=Calendar.getInstance().get(Calendar.YEAR);
	 	 int month=Calendar.getInstance().get(Calendar.MONTH);
	 	  int Date=Calendar.getInstance().get(Calendar.DATE);
	 	  String monthName=Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );
	 	  String day=Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH );
	 	  System.out.println("YEar: "+year);
	 	  System.out.println("Month: "+month);
	 	  System.out.println("Date: "+Date);
	 	  System.out.println("Month Name:"+monthName);
	 	 System.out.println("Day Name:"+day);
	 	 System.out.println(Calendar.getInstance().getDisplayName(Calendar.HOUR_OF_DAY, Calendar.LONG, Locale.ENGLISH ));
	 	System.out.println(Calendar.getInstance().getDisplayName(Calendar.MINUTE, Calendar.LONG, Locale.ENGLISH ));
	 	System.out.println(Calendar.getInstance().getDisplayName(Calendar.AM_PM, Calendar.LONG, Locale.ENGLISH ));
	 	System.out.println(Calendar.getInstance().getDisplayName(Calendar.MILLISECOND, Calendar.LONG, Locale.ENGLISH ));
	}

}
