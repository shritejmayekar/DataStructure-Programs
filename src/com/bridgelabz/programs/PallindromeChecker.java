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
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Util;



public class PallindromeChecker {
	public static String stringInput;
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the name:");
		stringInput=scanner.next();
		Util.pallindromeCheckerByQueue(stringInput);
		scanner.close();

	}

}
