package sleepIn;


/*
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 */


public class SleepIn {
	
	//weekday = T if weekday
	//vacation = T if vacation
	//if !weekday & vacation, return T
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation)
			return true;
		else
			return false;
	}
	public boolean sleepIn2(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
}
