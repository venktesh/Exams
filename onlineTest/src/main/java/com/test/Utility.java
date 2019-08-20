package com.test;

import java.util.Map;

public class Utility {

	public static Map<Integer, String> initializedDigits(Map<Integer, String> map) {
		map.put(0, "ZEERO");
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");
		map.put(6, "SIX");
		map.put(7, "SEVEN");
		map.put(8, "EIGHT");
		map.put(9, "NINE");
		map.put(10, "TEN");
		map.put(11, "ELEVEN");
		map.put(12, "TWELVE");
		map.put(13, "THIRTEEN");
		map.put(14, "FOURTEEN");
		map.put(15, "FIFTEEN");
		map.put(16, "SIXTEEN");
		map.put(17, "SEVENTEEN");
		map.put(18, "EIGHTEEN");
		map.put(19, "NINETEEN");
		map.put(20, "TWENTY");
		map.put(30, "THIRTY");
		map.put(40, "FOURTY");
		map.put(50, "FIFTY");
		map.put(60, "SIXTY");
		map.put(70, "SEVENTY");
		map.put(80, "EIGHTY");
		map.put(90, "NINTY");
		return map;
	}

	public static int getNumberOfDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}


	public static Map<Integer, String> initializedBigNumber(Map<Integer, String> bigNumbers) {
		bigNumbers.put(1000000000, "BILLION");
		bigNumbers.put(1000000, "MILLION");
		bigNumbers.put(100000, "LAKH");
	//	bigNumbers.put(10000, "THOUSAND");
		bigNumbers.put(1000, "THOUSAND");
		bigNumbers.put(100, "HUNDRED");
		//bigNumbers.put(10, "TEN");
		return bigNumbers;
	}
}
