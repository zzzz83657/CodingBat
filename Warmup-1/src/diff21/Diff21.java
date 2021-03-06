package diff21;

public class Diff21 {
	
	/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
	 */
	
	public int diff21(int n) {
		if (n > 21 || n < 21)
			return Math.abs(2 * (21 - n));
		else
			return Math.abs((21 - n));
	}
}
