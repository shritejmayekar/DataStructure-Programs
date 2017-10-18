
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Util;

/******************************************************************************
 *  
 *  Purpose: To check string is pallindrome or not using queue
 *  			
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/

public class PallindromeChecker {
	public static String stringInput;

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("please enter the name:");
			stringInput=scanner.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Util.pallindromeCheckerByQueue(stringInput);
		scanner.close();

	}

}
