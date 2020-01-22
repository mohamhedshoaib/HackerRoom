package HackerRoomSolutions.Hacker_room;

import java.util.*;
import java.io.*;

class ShiftedStrLftRght {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse:");

		String read = sc.next();
		int leftShifts = sc.nextInt();
		int rightShifts = sc.nextInt();
		
		char lastChar;
		char firstChar;
		String tempStr = "";
		int j = 0;
		leftShifts = leftShifts - 1;
		rightShifts = rightShifts - 1;

		System.out.println("Start Left notation for last string is : " +read);
		// leftrotation
		for (int i = 0; i <= leftShifts; i++) {

			System.out.println("i is " + i);
			firstChar = read.charAt(j);
			System.out.println("firstChar ************* " + firstChar);
			tempStr = read.substring(j, (read.length()));
			// + firstChar;
			tempStr = tempStr + firstChar;
			tempStr = tempStr.substring(j + 1, (tempStr.length()));
			System.out.println("tempStr " + tempStr);
			// dummyvar= tempStr + firstChar;
			read = tempStr;
			System.out.println(" i loop ********* read string is " + read);
		}

		System.out.println("Reversed string is: " + read);
		// System.out.println(reverse);

		System.out.println("left notation string is : " +read);
		System.out.println("Start Right notation for last string is : " +read);

		// right rotation
		for (int i = 0; i <= rightShifts; i++) {

			System.out.println("i is " + i);
			lastChar = read.charAt(read.length() - 1);
			System.out.println("lastChar " + lastChar);
			tempStr = read.substring(j, (read.length()));
			// + firstChar;
			tempStr = lastChar + tempStr;
			System.out.println("at first tempStr " + tempStr);
			tempStr = tempStr.substring(j, (tempStr.length() - 1));
			System.out.println("tempStr " + tempStr);
			// dummyvar= tempStr + firstChar;
			read = tempStr;
			System.out.println("i loop ********* read string is" + read);
		}

		System.out.println("FInal shifted String : " + read);
		// System.out.println(reverse);
	}

}
