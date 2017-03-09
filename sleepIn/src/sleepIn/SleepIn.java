package sleepIn;
import java.util.Calendar;

public class SleepIn {

	public static void main(String[] args) {
		SleepIn sleep = new SleepIn(Calendar.DAY_OF_WEEK, true);
	}
	
	public SleepIn(int dayOfWeek, boolean vacation) {
		String day = getDay(dayOfWeek);
	}
	
	public String getDay(int dayOfWeek){
		switch (dayOfWeek) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		default:
			return "Saturday";
		}
	}
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false && vacation == true)
				return true;
		return false;
	}
}
