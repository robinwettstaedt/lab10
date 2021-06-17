
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Scanner;

public class JulianDate {

	public static final LocalDateTime START_DATE = LocalDateTime.of(-4712,1,1,12,0,0,0);
	double julianDate = 0.0;

	public static void main(String[] args) throws IOException{
		currentTime();   //get CurrentTime as standard and julian Date
		
		//Input year, month, day | split into 3 variables
		//giveJulianDate(year, month, day);
		
		//Input JulianDate -> normal calculations using the double value
		
		//adding days: date + 25 =
		//substracting days: date - 25 = 
		//number of days between: date * date = 
		//getting weekday date/ =
		
		//as long as only juliandates are used, the display can be a double value, 
		//as soon as normal dates get introduced, we could always calculate in julian
		//in the backend and display the value in the wanted format as a string
	}
	public void addDays (int days) {
		julianDate =- days;
	}
	
	public void substractDays (int days) {
		julianDate =+ days;
	}
	
	public static double giveJulianDate(double year, double month, double day)
    {
        double jd = 0;
        double y = year;
        double m = month;
        double d = day;
        jd = Math.floor((1461 * (y + 4800 + (m - 14)/12))/4 + (367 * (m-2-12*((m-14)/12)))/12-(3*((y+4900+(m-14)/12)/100))/4+d-32077); 
        return jd +2;
    }

	public static double currentJulianDate() {
		LocalDateTime now = LocalDateTime.now();
		return giveJulianDate(now.getYear(), now.getMonthValue(), now.getDayOfMonth());
	}
	public static double getCurrentDay() {
		LocalDateTime now = LocalDateTime.now();
		return now.getDayOfMonth();
	}
	public static double getCurrentMonth() {
		LocalDateTime now = LocalDateTime.now();
		return now.getMonthValue();
	}
	public static void currentTime() {
		LocalDateTime now = LocalDateTime.now();
		int y = now.getYear();
		int m = now.getMonthValue();
		int d = now.getDayOfMonth();
		System.out.println(d + "." + m + "." + y);
		System.out.println(giveJulianDate(y,m ,d));
	}
	public static int getTimeBetween(double first, double second) {
		
		return (int) Math.round(Math.abs(first-second));
		
	}
	

	
	
	
	
}
