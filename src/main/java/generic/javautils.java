package generic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javautils {




		public int getRandomNo()
		{
	Random ran=new Random();
	int random=ran.nextInt(500);
	return random;
	}
	public String getSystemDate()
	{
	Date dt=new Date();
	String date=dt.toString();
	return date;
	}
	public String getSystemDateInFormat()
	{
	SimpleDateFormat dateformat=new SimpleDateFormat("DD-mm-yyyy HH-mm-ss");
	 Date dt=new Date();
	 String date=dateformat.format(dt);
	 return date;
	 }
	 
}
