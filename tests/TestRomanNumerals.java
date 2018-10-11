import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	@Test(expected = IllegalArgumentException.class)
	public void testCheckInputIXCM() throws IllegalArgumentException{
		RomanNumerals rm = new RomanNumerals();
		String roman1 = "IIII";
		String roman2 = "IIIXXXMMMM";
		String roman3 = "MCMXXXX";
		
		rm.checkInput(roman1);
		rm.checkInput(roman2);
		rm.checkInput(roman3);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckInputVLD() throws IllegalArgumentException{
		RomanNumerals rm = new RomanNumerals();
		String roman1 = "VV";
		String roman2 = "MLL";
		String roman3 = "DDD";
		
		rm.checkInput(roman1);
		rm.checkInput(roman2);
		rm.checkInput(roman3);
		
	}

}
