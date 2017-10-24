
package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import com.bridgelabz.util.OrderedList;
/******************************************************************************
 *  
 *  Purpose: To add element in linked list in sorted manner.
 *  			 i.e when you add element in list it will automatically
 *  				sort itself
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
public class OrderedListMain {
	/*variable Declaration */
	public static int searchValue;
	public static boolean flag=true;
	public static String readString,stringdummy;
	static   Scanner scanner=new Scanner(System.in);
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*	Generic Ordered list */
		OrderedList<Integer> list=new OrderedList<Integer>();

		/*	File Operation */
		File file=new File("OrderList.txt");
		/*	If file not exist create file */
		if(file.createNewFile())
			System.out.print("File created");
		else
			System.out.print("File exists");
		/*	Writes the data in file */
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("5 2 10 4 3");
		fileWriter.close();
		/* read the file */
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		while((readString=bufferedReader.readLine())!=null) {
			stringdummy=readString+stringdummy;

		}
		String splitString[]=stringdummy.split("\\s");
		bufferedReader.close();
		for (int i = 0; i < splitString.length-1; i++) {

			list.insertAtEnd(Integer.parseInt(splitString[i]));
		}

		/* Generic UnOrdered List */
		//	OrderedList<Integer> list=new OrderedList<Integer>();

		while(flag) {
			list.bubbleSort();
			System.out.println("1.Insert at first"
					+ "\n2.Insert at End"
					+ "\n3.Insert at position"
					+ "\n4.Delete at first"
					+ "\n5.Delete at End"
					+ "\n6.Diplay"
					+ "\n7.Delete at position"
					+ "\n8.Get size"
					+ "\n9. Search"
					+ "\n10.Exit"
					+ "\n11.sort"
					+ "\n12.search\n");
			try {
				switch(scanner.nextInt()) {
				case 1: System.out.print("Enter value:");
				list.insertAtFirst(scanner.nextInt());
				break;
				case 2: System.out.print("Enter value:");
				list.insertAtEnd(scanner.nextInt());

				break;
				case 3: System.out.print("Enter value and position");
				list.insertAtPos(scanner.nextInt(),scanner.nextInt());

				break;
				case 4: list.deleteAtFirst();

				break;
				case 5: list.deleteAtEnd();

				break;
				case 6: list.display();
				break;
				case 7: list.deletByPosition(scanner.nextInt());

				break;
				case 8: System.out.println("size:"+list.size);
				break;
				case 9:
					System.out.println("Enter value to search");
					System.out.println("present:"+list.search(scanner.nextInt()));
					list.bubbleSort();
					break;
				case 10: flag=false;
				break;
				case 11:list.bubbleSort();
				break;
				case 12:searchValue=scanner.nextInt();
				System.out.println("value present:"+list.search(searchValue));
				list.bubbleSort();
				break;
				default: System.out.println("Invalid choice");
				break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag=false;
			}
		}

	}

}