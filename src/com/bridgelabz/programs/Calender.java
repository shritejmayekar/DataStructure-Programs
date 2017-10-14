/******************************************************************************
 *  Purpose: To take month and uyear as an command-line argument and display 
 *  			Calendar
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.util.CalenderDisp;

public class Calender {
	public static int month,year;
	public static void main(String[] args) {
		 month=Integer.parseInt(args[0]);
		 year=Integer.parseInt(args[1]);
		 
		 CalenderDisp.displayCalender(month, year);

	}

}
