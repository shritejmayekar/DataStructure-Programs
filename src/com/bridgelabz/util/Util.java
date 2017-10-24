
package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
/******************************************************************************
 *  
 *  Purpose: To perform different functionalities
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class Util {
	public static int[][] array=new int[25][10];
	public static int k,l,m,n,o,p,q,r,s,t,counter,cashBalance;
	public static Random randdom=new Random();
	//
	/**
	 * 
	 * @param string1
	 * @param string2
	 * @return boolean (isAnagram or not)
	 */
	public static boolean isAnagram(String string1,String string2) {
		int counter=0; 
		/* 
		 * Remove space
		 */
		String wordOne=string1.replaceAll("\\s","");
		String wordTwo=string2.replaceAll("\\s","");
		/*
		 * convert to lower case
		 */
		wordOne=wordOne.toLowerCase();
		wordTwo=wordTwo.toLowerCase();
		/*
		 * String to char array conversion
		 */
		char chararray1[]=wordOne.toCharArray();
		char chararray2[]=wordTwo.toCharArray();

		if(chararray1.length!=chararray2.length){
			return false;
		}
		for (int i = 0; i < chararray1.length; i++) {
			for (int j = 0; j < chararray2.length; j++) {
				if(chararray1[i]==chararray2[j]){
					chararray2[j]='#';
					counter++;
					break;
				}

			}

		}
		return (counter==chararray1.length);
	}
	/**
	 * isAnagram method to find two number as anagram
	 * @param number1
	 * @param number2
	 * @return boolean (true or false) 
	 */
	public static boolean isAnagram(int number1,int number2) {
		int counter=0;
		int temp=number1;
		if(position(temp)==position(number2)) {
			int digit=temp;
			while(temp!=0) {
				digit=temp%10;
				if(findNumber(digit, number2))
					counter++;
				temp=temp/10;
			}
			if(counter==position(number1))
				return true;

		}
		return false;
	}
	/**
	 * isAnagram method to find two number as anagram
	 * @param number1
	 * @param number2
	 * @return boolean (true or false) 
	 */
	public static boolean isAnagramNum(int number1,int number2) {

		int i=0;
		int pos=position(number1);
		int array[]=new int[pos];
		while(number1!=0) {

			array[i++]=number1%10;
			number1=number1/10;
		}
		return false;
	}
	/**
	 * findNumber method to find same digit present in other number
	 * @param digit
	 * @param number2
	 * @return
	 */
	public static boolean findNumber(int digit,int number2) {
		int temp=number2;
		while(temp!=0) {
			if(digit==temp%10)
				return true;
			temp=temp/10;
		}
		return false;
	}
	/**
	 * position method will finds the position of digit number
	 * @param number
	 * @return
	 */
	public static int position(int number) {
		if(number<10)
			return 1;
		else if(number<100)
			return 2;
		else if(number<1000)
			return 3;
		else if(number<10000)
			return 4;
		else
			return 0;
	}
	/**
	 * prime method to check prime number
	 * @param number
	 * @return true or false (no. is prime or not)
	 */
	public static boolean isPrime(int number) {
		int counter=0;
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				counter++;

			}
		}
		if(counter==2)
			return true;
		return false;
	}
	/**
	 * primeNumber method is extension of isPrime which give range of prime number
	 * @param low
	 * @param high
	 */
	public static void primeNumber(int low,int high) {

		for(int i=low;i<high;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				if(i<100)
					array[k++][0]=i;
				if(i>100 && i<200)
					array[l++][1]=i;
				if(i>200 && i<300)
					array[m++][2]=i;
				if(i> 300 && i<400)
					array[n++][3]=i;
				if(i>400 && i<500)
					array[o++][4]=i;
				if(i>500 && i<600)
					array[p++][4]=i;
				if(i>600 && i<700)
					array[q++][4]=i;
				if(i>700 && i<800)
					array[r++][4]=i;
				if(i>800 && i<900)
					array[s++][4]=i;
				if(i>900 && i<1000)
					array[t++][4]=i;
				counter++;
			}

		}
	}
	public static void print() {
		for(int i=0;i<25;i++) {
			for(int j=0;j<10;j++) {
				if(array[i][j]!=0)
					System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	/**
	 * anagram and pallindrome method for finding number which is anagram and pallindrome 
	 * @param low
	 * @param high
	 */
	public static void anagramAndPallindrome(int low,int high) {
		int []primeNumberArray=new int[high];
		int k=0;
		int counter=0;
		Stack<Integer> stackLeft=new Stack<Integer>();
		Stack<Integer> stackRight=new Stack<Integer>();
		Queue<Integer>  queueLeft=new Queue<>();
		Queue<Integer>  queuerigth=new Queue<>();
		for(int i=low;i<high;i++) {
			if(isPrime(i))
			{
				primeNumberArray[k++]=i;


			}
		}

		System.out.println("=======Anagram And Pallindrome Number=====");
		for(int i=0;i<k;i++) {
			for(int j=1;j<k;j++) {
				if(primeNumberArray[i]!=primeNumberArray[j])
					if(isAnagram(primeNumberArray[i], primeNumberArray[j])
						&&(reverseNumber(primeNumberArray[i])==primeNumberArray[j])) {
							System.out.println(primeNumberArray[i]+" "+primeNumberArray[j]);
							counter++;
							stackLeft.push(primeNumberArray[i]);
							stackRight.push(primeNumberArray[j]);
							queueLeft.Enqueue(primeNumberArray[i]);
							queuerigth.Enqueue(primeNumberArray[j]);
						}
			}
		}
		System.out.println("stack using");
		for(int size=0;size<counter;size++)
			System.out.println(stackLeft.pop() +" "+stackRight.pop());
		System.out.println("Queue sing");
		for(int size=0;size<counter;size++)
			System.out.println(queueLeft.Dequee()+" "+queuerigth.Dequee());
	}
	/**
	 * anagram method for queue
	 * @param low
	 * @param high
	 */
	public static void anagram(int low,int high) {
		int []primeNumberArray=new int[high];
		int k=0;
		int counter=0;
		Stack<Integer> stackLeft=new Stack<Integer>();
		Stack<Integer> stackRight=new Stack<Integer>();
		Queue<Integer>  queueLeft=new Queue<>();
		Queue<Integer>  queuerigth=new Queue<>();
		for(int i=low;i<high;i++) {
			if(isPrime(i))
			{
				primeNumberArray[k++]=i;


			}
		}

		System.out.println("=======Anagram And Pallindrome Number=====");
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				if(primeNumberArray[i]!=primeNumberArray[j])
					if(isAnagram(primeNumberArray[i], primeNumberArray[j])
						&&(reverseNumber(primeNumberArray[i])==primeNumberArray[j])) {
							counter++;
							stackLeft.push(primeNumberArray[i]);
							stackRight.push(primeNumberArray[j]);
							queueLeft.Enqueue(primeNumberArray[i]);
							queuerigth.Enqueue(primeNumberArray[j]);
						}
					
			}
		}
		System.out.println("stack Using");
		for(int size=0;size<counter;size++)
			System.out.println(stackLeft.pop() +" "+stackRight.pop());
		System.out.println("Queue Using");
		for(int size=0;size<counter;size++)
			System.out.println(queueLeft.Dequee()+" "+queuerigth.Dequee());
	}
	/**
	 * digitConvert method convert and sort number
	 * @param number
	 * @return
	 */
	public static int[] digitConvert(int number) {
		int[] digit=new int[3];
		int k=0;
		while(number!=0) {
			digit[k++]=number%10;
			number=number/10;
		}

		return digit;
	}
	/**
	 * isAnagramForNumber finds anagram for number
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static boolean  isAnagramForNumber(int number1,int number2) {

		int[] arrayOne=digitConvert(number1);
		int[] arrayTwo=digitConvert(number2);
		bubbleSort(arrayOne);
		bubbleSort(arrayTwo);
		for (int i = 0; i < arrayTwo.length; i++) {
			if(arrayOne[i]!=arrayTwo[i])
				return false;
		}
		return true;
	}
	/**
	 * bubbleSort method sorts by alphabetical order
	 * @param arrayOne
	 */
	public static  void bubbleSort(int[] arrayOne) {
		int temp;
		for(int i=0;i<arrayOne.length;i++) {
			for(int j=i+1;j<arrayOne.length;j++) {
				if(arrayOne[i]>(arrayOne[j])) {
					temp=arrayOne[j];
					arrayOne[j]=arrayOne[i];
					arrayOne[i]=temp;
				}
			}
		}
	}
	/**
	 * anagramAndPrimeGenerator method will generate prime and anagram
	 * @param low
	 * @param high
	 */
	public static void anagramAndPrimeGenerator(int low,int high) {
		int[] array=new int[25];
		int[] array2=new int[143];
		int[] digit=new int[3];
		int k=0,number,l=0;
		for(int i=low;i<high;i++) {
			if(Util.isPrime(i))
				if(i<100)
					array[k++]=i;
				else
					array2[l++]=i;
		}

		for (int i = 0; i <array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(Util.isAnagramForNumber(array2[i], array2[j])) {
					if(array2[i]!=array2[j])
						System.out.println(array2[i]+" "+array2[j]);
				}
			}

		}
	}

	/**
	 * pallindromeCheckerByqueue method uses queue concept to check pallindrome or not
	 * @param stringInput
	 */
	public static void pallindromeCheckerByQueue(String stringInput) {
		Queue<Character> queue=new Queue<>();
		String stringReverse="";
		for(int i=stringInput.length()-1;i>=0;i--) {
			queue.Enqueue(stringInput.charAt(i));
		}
		for(int i=0;i<stringInput.length();i++)
			stringReverse=stringReverse+queue.Dequee();



		if(stringInput.equals(stringReverse))
			System.out.println("The "+stringInput+" is pallindrome");
		else
			System.out.println("The "+stringInput+" is not pallindrome");

	}
	/**
	 * isPalindrome for string ,find string pallindrome or not
	 * @param string
	 * @return
	 */
	public static boolean isPallindrome(String string) {
		char characterArray[]=string.toCharArray();
		int counter=0;
		for (int i = 0; i < characterArray.length/2; i++) {
			if(characterArray[i]==characterArray[characterArray.length-1-i])  {
				counter++;

			}	
		}
		if(counter==characterArray.length/2)
			return true;
		return false;
	}
	/**
	 * isPallindrome for integer, find number is pallindrome or not
	 * @param number
	 * @return
	 */
	public static boolean isPallindrome(int number) {

		int reverseNumber=0;
		int temp=number;
		while(temp!=0) {
			reverseNumber=temp%10+reverseNumber*10;
			temp=temp/10;

		}		
		return (number==reverseNumber);
	}
	/**
	 * reversNumber method reverse the number
	 * @param number
	 * @return
	 */
	public static int reverseNumber(int number) {
		int reverseNumberReturn=0;
		int temp=number;
		while(temp!=0) {
			reverseNumberReturn=temp%10+reverseNumberReturn*10;
			temp=temp/10;

		}		
		return reverseNumberReturn;
	}


	/**
	 * dayOfWeek method to display moth and day
	 * @param month
	 * @param day
	 * @param year
	 */
	public static void dayOfWeek(int month,int day,int year) {
		int nyear=0,nday=0,nmonth=0;
		String strMonth[]={"","January","February","March","April"
				,"May","June","July","August","September","October","November","December"};
		String strDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		nyear=year-(14-month)/12;
		int temp=nyear+nyear/4-nyear/100+nyear/400;
		nmonth=month+12*((14-month)/12)-2;
		nday=(day+temp+31*nmonth/12)%7;

		System.out.println(strMonth[month]+" "+day+" "+strDay[nday]);

	}
	/**
	 * temperatureConversionF method converts celsius to farenheit
	 * @param temperature
	 * @return
	 */
	public static double temperatureConversionF(double temperature) {
		return (temperature*9)/5+32;
	}
	/**
	 * temperatureConversionC method converts farenheit to celsius
	 * @param temperature
	 * @return
	 */
	public static double temperatureConversionC(double temperature) {
		return (temperature-32)*5/9;
	}
	/**
	 * monthlyPayment method will calculates monthly pay
	 * @param principal
	 * @param year
	 * @param rate
	 * @return
	 */
	public static double monthlyPayment(double principal,double year,double rate) {
		double month=12*year;
		double rateOf=rate/(100*12);
		double payment=(principal*rateOf)/(1-Math.pow(1+rateOf,-month));
		return payment;
	}
	/**
	 * sqrt method gives the square root of number
	 * @param number
	 * @return
	 */
	public static double sqrt(double number) {
		double t=number;
		double epsilon=1e-15;
		t=(number/t+t)/2;
		while(Math.abs(t - number/t) > epsilon*t) {
			t=(number/t+t)/2;

		}
		return t;

	}
	/**Random
	 * toBinary method converts decimal to binary
	 * @param number
	 * @return 
	 * 
	 */
	public static String toBinary(int number) {
		String binary="";
		int num=0;
		while(number!=0) {
			if(number%2==0) {
				binary="0"+binary;
				num=num*10+0;
			}
			else {

				binary="1"+binary;
				num=num*10+1;
			}
			number=number/2;

		}
		swapNimble(binary);	
		return binary;

	}
	/**
	 * printBinaryTodecimal method will print print decimal number
	 * @param binaryArrray
	 */
	public static void printBinaryTodecimal(int[] binaryArrray) {
		int sum=0;
		int bit=7;
		for(int i=0;i<binaryArrray.length;i++) {
			if(binaryArrray[i]==1) {
				sum=(int) (sum+Math.pow(2, bit));
			}
			bit--;

		}
		System.out.println("The decimal number="+sum);
	}
	/**
	 * swapNimble method will swap the nimble
	 * @param binary
	 */
	public static void swapNimble(String binary) {
		int[] binaryBitArray=new int[8];
		int[] swapNimbelArray=new int[8];

		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='1')
				binaryBitArray[binaryBitArray.length-binary.length()+i]=1;
			else
				binaryBitArray[binaryBitArray.length-binary.length()+i]=0;
		}	
		printBinaryTodecimal(binaryBitArray);
		for(int i=0;i<binaryBitArray.length;i++) {
			if(i<4)
				swapNimbelArray[i]=binaryBitArray[4+i]; 
			else
				swapNimbelArray[i]=binaryBitArray[i-4];
		}
		printBinaryTodecimal(swapNimbelArray);

	}


	/**
	 * randomGenerator generates random number
	 * @return
	 */
	public static int randomGenerator() {
		Random random=new Random();
		return random.nextInt(100);
	}
	/**
	 * hashMap method will put values in slot according to remainder of number 
	 * 	slots are 0-10
	 */
	public static void hashMap() {
		LinkedList<Integer> list;
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();

		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<15;i++) {
			arrayList.add(random.nextInt(30));
		}

		System.out.println(arrayList);
		HashMap<Integer,LinkedList<Integer>> hashMap=new HashMap<>();
		for(Integer integer:arrayList) {
			System.out.println(integer);
			int slot=integer%11;
			list=hashMap.get(slot);
			if( list == null )
			{
				//System.out.println("Value is null");
				list = new LinkedList<>();
				hashMap.put(slot, list);
			}

			//System.out.println("Value is not null");
			list.add(integer);
		}
		System.out.println(hashMap);
		System.out.println("Enter Number you want to search ");
		int num = scanner.nextInt();
		int SlotNumber= num%11;

		list = hashMap.get(SlotNumber);
		System.out.println(list);
		System.out.println(list);
		if(list.contains(num))
		{
			System.out.println("Number is present \nshould be delete");
			System.out.println(list.pop()+" is poped");
		}
		else
		{
			System.out.println(num+" is not present \nshould be push");
			int slot=num%11;
			list=hashMap.get(slot);
			list.add(num);
		}

		System.out.println(hashMap);
	}public static int withdraw(Integer amount) {
		cashBalance=randdom.nextInt(50000);
		if(amount>=cashBalance) {
			System.out.println("Low balance");
			return 1000;
		}
		else {
			cashBalance=(cashBalance-amount);

			return cashBalance;

		}

	}
	public static int deposit(Integer amount) {
		cashBalance=randdom.nextInt(50000);
		if(amount>0) {
			cashBalance=cashBalance+amount;

		}
		return cashBalance;

	}
	public static void main(String args[]) {
		dayOfWeek(10,5,2017);
		System.out.println(temperatureConversionF(36));
		System.out.println(temperatureConversionC(98));
		System.out.println("payment="+monthlyPayment(1000,0.6,10));

		System.out.println("sqrt "+sqrt(35));
		System.out.println("Binary "+toBinary(5));
		String str=toBinary(32);
		System.out.println("Dec "+str.charAt(0));
	}

}




