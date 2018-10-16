import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		this.checkInput(romanNum);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String c1; String c2="";
		int n1; int n2=0;
		
		for (int i=0; i<romanNum.length(); i++) {
			c1 = Character.toString(romanNum.charAt(i));
			n1 = this.convertSingles(c1);
			
			if (i<(romanNum.length()-1)) {
				c2 = Character.toString(romanNum.charAt(i+1));
				n2 = this.convertSingles(c2);
				}
				if (n1<n2) {
					int n = this.subtraction(c1,c2);
					list.add(n);
					i++;
					}
				
			else {
				list.add(n1);
			}
		}
		
		int result = 0;
		for(int i : list)
		    result += i;
		return result;
		
	}
	public void checkInput(String romanNum) throws IllegalArgumentException{
		Pattern p1 = Pattern.compile("([ixcm])\\1\\1\\1", Pattern.CASE_INSENSITIVE);
	    Matcher m1 = p1.matcher(romanNum);
	    if (m1.find()) throw new IllegalArgumentException();
	    							//V, L, or D 2 times
	    Pattern p2 = Pattern.compile("([vld])\\1", Pattern.CASE_INSENSITIVE);
	    Matcher m2 = p2.matcher(romanNum);
	    if (m2.find()) throw new IllegalArgumentException();
		
	}
	
	public int convertSingles(String romanDigit) {
		int i = 0;
		String rd = romanDigit.toLowerCase();
		
		switch (rd){
		case "i": i=1;
			break;
		case "v": i=5;
			break;
		case "x": i=10;
			break;
		case "l": i=50;
			break;
		case "c": i=100;
			break;
		case "d": i=500;
			break;
		case "m": i=1000;
			break;
		}
		
		return i;
	}
	
	public int subtraction(String c1, String c2) throws IllegalArgumentException{
		String str = c1+c2;
		
		Pattern p1 = Pattern.compile("^[i][lcdm]", Pattern.CASE_INSENSITIVE);
	    Matcher m1 = p1.matcher(str);
	    if (m1.find()) throw new IllegalArgumentException();
	    
	    Pattern p2 = Pattern.compile("^[x][dm]", Pattern.CASE_INSENSITIVE);
	    Matcher m2 = p2.matcher(str);
	    if (m2.find()) throw new IllegalArgumentException();
	    
	    Pattern p3 = Pattern.compile("^[vld]", Pattern.CASE_INSENSITIVE);
	    Matcher m3 = p3.matcher(str);
	    if (m3.find()) throw new IllegalArgumentException();
	    
	    int n1 = this.convertSingles(c1);
	    int n2 = this.convertSingles(c2);
	    int subd = n2 - n1;
		
	    return subd;
	}
	
}
