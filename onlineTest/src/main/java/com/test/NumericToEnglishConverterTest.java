/**
 * 
 */
package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author vendwive1
 *
 */
class NumericToEnglishConverterTest {

	/**
	 * Test method for {@link com.test.NumericToEnglishConverter#numberToWorkds(int)}.
	 */
	@Test
	void test01() {
		String  expected ="THREE LAKH SEVENTY EIGHT  THOUSAND SEVEN HUNDRED FIFTY ONE ";
		
		String actual=	NumericToEnglishConverter.numberToWorkds(378751);
		assertEquals(expected, actual);
	}

	@Test
	void test02() {
		String  expected ="FIVE THOUSAND EIGHTY SEVEN EIGHTY SEVEN ";
		// 
		String actual=	NumericToEnglishConverter.numberToWorkds(5087);
		assertEquals(expected, actual);
	} 
	
	@Test
	void test03() {
		String  expected ="SEVEN";
		// 
		String actual=	NumericToEnglishConverter.numberToWorkds(7);
		assertEquals(expected, actual);
	} 
	

}
