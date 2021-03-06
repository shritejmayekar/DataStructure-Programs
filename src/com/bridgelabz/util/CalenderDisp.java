package com.bridgelabz.util;

public class CalenderDisp {
	/**
	 * dayOfWeek method will return starting day of month
	 * @param month
	 * @param day
	 * @param year
	 */
	public static int dayOfWeek(int month,int year) {
		int nyear=0;
		int nday=0;
		int nmonth=0;
		int day=1;
		String strMonth[]={"","January","February","March","April"
				,"May","June","July","August","September","October","November","December"};
		String strDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		nyear=year-(14-month)/12;
		int temp=nyear+nyear/4-nyear/100+nyear/400;
		nmonth=month+12*((14-month)/12)-2;
		nday=(day+temp+31*nmonth/12)%7;
		return nday;
	}
	/**
	 * isLeap method check current year is leap or not
	 * @param year
	 * @return
	 */
	public static boolean isLeap(int year) {
		if((year%4==0)||(year%400==0))
			return true;
		else if(year%100==0)
			return false;
		return false;
	}
	/**
	 * 	displayCalender method displayCalender and dates
	 *	@param month and year
	 **/
	public static void displayCalender(int month,int year) {
		int space=dayOfWeek(month, year);
		String mMonth[]={"","January","February","March","April","May",
				"June","July","August","September","October","November","December"};
		System.out.println(mMonth[month]+" "+year);

		int Month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

		if(isLeap(year))
			Month[2]=29;
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		int number=1;
		int spaceIn=0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if(spaceIn<space){
					System.out.print("     ");

					spaceIn++;
				}
				else if(number<=Month[month]) {
					System.out.print(number);
					number++;
					if(number<11) {
						System.out.print("    ");

					}
					else {
						System.out.print("   ");

					}
				}
			}
			System.out.println();

		}
	}
	public static void displayCalenderLink(int month,int year) {
		int space=dayOfWeek(month, year);
		String mMonth[]={"","January","February","March","April","May",
				"June","July","August","September","October","November","December"};
		System.out.println(mMonth[month]+" "+year);
		Queue<Object> queue=new Queue<>();    
		int Month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

		if(isLeap(year))
			Month[2]=29;
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		int number=1;
		int spaceIn=0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if(spaceIn<space){
					queue.Enqueue("     ");
					spaceIn++;
				}
				else if(number<=Month[month]) {
					queue.Enqueue(number);
					number++;
					if(number<11) {
						queue.Enqueue("    ");
					}
					else {
						queue.Enqueue("   ");
					}
				}
			}
			queue.Enqueue("\n");
		}


		while(!queue.isEmpty())
			System.out.print(queue.Dequee());

	}
}
