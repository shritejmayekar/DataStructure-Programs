
package com.bridgelabz.programs;

import com.bridgelabz.util.CalenderDisp;
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
public class Calender {
	public static int month,year;
	public static void main(String[] args) {
		 try {
			month=Integer.parseInt(args[0]);
			 year=Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 CalenderDisp.displayCalender(month, year);

	}

}
