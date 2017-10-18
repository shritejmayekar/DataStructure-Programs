package com.bridgelabz.programs;

import com.bridgelabz.util.CalenderDisp;

public class CalenderByLink {
	public static int month,year;
	public static void main(String[] args) {
		 try {
			month=Integer.parseInt(args[0]);
			 year=Integer.parseInt(args[1]);
			 
			 CalenderDisp.displayCalenderLink(month, year);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
