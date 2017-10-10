package com.bridgelabz.util;

public class Calender {
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 */
		public static void dayOfWeek(int month,int year) {
			int nyear=0,nday=0,nmonth=0,day=1;
			String strMonth[]={"","January","February","March","April"
			,"May","June","July","August","September","October","November","December"};
			String strDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			nyear=year-(14-month)/12;
			int temp=nyear+nyear/4-nyear/100+nyear/400;
			nmonth=month+12*((14-month)/12)-2;
			nday=(day+temp+31*nmonth/12)%7;
			
			System.out.println(strMonth[month]+" "+day+" "+strDay[nday]);
			
		
		}
	public static void main(String[] args) {
		dayOfWeek(11, 2017);
		
	}

}
