package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumericToEnglishConverter {

	public static Map<Integer, String> digits = null;

	public static Map<Integer, String> bigNumbers = null;
	public static int localNum;
	public static String englishNum = "";
	static {
		digits = new HashMap<Integer, String>();
		bigNumbers = new LinkedHashMap<Integer, String>(); // sorting gaureenteed
		digits = Utility.initializedDigits(digits);
		bigNumbers = Utility.initializedBigNumber(bigNumbers);
	}

	public static String numberToWorkds(int num) {
		localNum = num;
		englishNum = "";
		int digitCount = Utility.getNumberOfDigits(num);

		if (digitCount > 1) {
			bigNumbers.forEach((key, val) -> {

				int number = localNum / key;
				localNum = localNum % key;
				if (number > 0) {
					int numOfDigit = Utility.getNumberOfDigits(number);
					if (numOfDigit == 1) {
						englishNum = englishNum + digits.get(number) + " " + val + " ";
					} else {
						englishNum = englishNum + handle2ndDigit(number) + " " + val + " ";
					}
				}

				if (localNum < 99) {
					englishNum = englishNum + handle2ndDigit(localNum);
				}
				if (localNum < 10) {
					englishNum = englishNum + digits.get(localNum);
				}
			}

			);

		} else {
			englishNum = englishNum + digits.get(localNum);
		}

		/*
		 * int digitCount= Utility.getNumberOfDigits(num); if(digitCount==1) {
		 * System.out.println(digits.get(num)); } else if(digitCount==2) {
		 * System.out.println(digits.get(num)); } else {
		 * System.out.println("Working on it "); }
		 */
		return englishNum;

	}

	private static String handle2ndDigit(int number) {
		// TODO Auto-generated method stub

		int key = (number / 10) * 10;
		int reminder = number % 10;

		return digits.get(key) + " " + digits.get(reminder) + " ";

	}

	public static void main(String[] args) {

		System.out.println(numberToWorkds(7));
		// System.out.println(numberToWorkds(5087));
		// System.out.println(numberToWorkds(1));
		// 5087
		// System.out.println(handle2ndDigit(68));

	}

}
