package calculateAge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateAge {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar todayCalendar = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = dateFormat.parse("22/11/1992");
		
		Calendar dobCalendar = Calendar.getInstance();
		
		dobCalendar.setTime(dob);
		
		int year = todayCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
		int monthNow = todayCalendar.get(Calendar.MONTH);
		int monthDob = dobCalendar.get(Calendar.MONTH);
		int dayNow = todayCalendar.get(Calendar.DAY_OF_MONTH);
		int dayDob = dobCalendar.get(Calendar.DAY_OF_MONTH);
		
		if (monthDob > monthNow) {
			year--;
		} else if (monthDob == monthNow) {
			if(dayDob > dayNow) {
				year--;
			}
		} 
		
		System.out.println("Age of the person is: "+year+" Years ");
			
	}

}
