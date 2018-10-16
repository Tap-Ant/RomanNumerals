import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	@Test(expected = IllegalArgumentException.class)
	public void testCheckInputIXCM() throws IllegalArgumentException{
		RomanNumerals rm = new RomanNumerals();
		String roman1 = "IIII";
		String roman2 = "IIIXXXMMMM";
		String roman3 = "mcmxxxx";
		
		//rm.checkInput(roman1);
		//rm.checkInput(roman2);
		rm.checkInput(roman3);
		/*Uncomment the one you wish to test in isolation*/
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCheckInputVLD() throws IllegalArgumentException{
		RomanNumerals rm = new RomanNumerals();
		String roman1 = "VV";
		String roman2 = "MLL";
		String roman3 = "ddd";
		
		//rm.checkInput(roman1);
		rm.checkInput(roman2);
		//rm.checkInput(roman3);
		/*Uncomment the one you wish to test in isolation*/
		
	}
	
	@Test
	public void testConvertSingles() {
		RomanNumerals rm = new RomanNumerals();
		String roman1 = "MMXIv";
		String romanC1 = Character.toString(roman1.charAt(0)); //M
		String romanC2 = Character.toString(roman1.charAt(2)); //X
		String romanC3 = Character.toString(roman1.charAt(4)); //V
		
		assertEquals(1000, rm.convertSingles(romanC1));
		assertEquals(10, rm.convertSingles(romanC2));
		assertEquals(5, rm.convertSingles(romanC3));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractionThrows() throws IllegalArgumentException{
		RomanNumerals rm = new RomanNumerals();
		String x1 = "I"; String x2 = "L";
		String y1 = "x"; String y2 = "d";
		String z1 = "I"; String z2 = "D";
		String a1 = "v"; String a2 = "m";
		
		rm.subtraction(x1, x2);
		//rm.subtraction(y1, y2);
		//rm.subtraction(z1, z2);
		//rm.subtraction(a1, a2);
		/*Uncomment the one you wish to test in isolation*/
		
	}
	
	@Test
	public void testSubtraction() {
		RomanNumerals rm = new RomanNumerals();
		
		String x1 = "I"; String x2 = "V";
		int result1 = rm.subtraction(x1, x2);
		assertEquals(4, result1);
		
		String y1 = "x"; String y2 = "c";
		assertEquals(90, rm.subtraction(y1, y2));
		
		String z1 = "C"; String z2 = "m";
		assertEquals(900, rm.subtraction(z1, z2));
	}
	
	@Test
	public void testConvertToInteger() {
		RomanNumerals rm = new RomanNumerals();
		String romanNum1 = "mmxiv";
		String romanNum2 = "MCMLXXXIV";
		String romanNum3 = "MCMXCII";
		String romanNum4 = "MMMDCCCLXXXVIII";
		String romanNum5 = "cdxliv";
		
		assertEquals(2014, rm.convertToInteger(romanNum1));
		assertEquals(1984, rm.convertToInteger(romanNum2));
		assertEquals(1992, rm.convertToInteger(romanNum3));
		assertEquals(3888, rm.convertToInteger(romanNum4));
		assertEquals(444, rm.convertToInteger(romanNum5));
	}

}
