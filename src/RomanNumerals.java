import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;
		
	}
	public void checkInput(String romanNum) throws IllegalArgumentException{
		Pattern p1 = Pattern.compile("([a-z\\d])\\1\\1\\1", Pattern.CASE_INSENSITIVE);
	    Matcher m1 = p1.matcher(romanNum);
	    if (m1.find()) throw new IllegalArgumentException();
	    							//V, L, or D 2 times
	    Pattern p2 = Pattern.compile("([a-z\\d])\\1", Pattern.CASE_INSENSITIVE);
	    Matcher m2 = p2.matcher(romanNum);
	    if (m2.find()) throw new IllegalArgumentException();
		
	}
}
