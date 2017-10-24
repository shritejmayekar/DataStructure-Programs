
package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.util.List;
/******************************************************************************
 *  
 *  Purpose: To take input from file and search word in list if found than remove 
 *  and if not found add to list
 *  			
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   05-10-2017
 *
 ******************************************************************************/
public class UnOrderedListMain {
	public static String readString,stringdummy;
	public static int size;
	public static String str[]=new String[5];
	public static Scanner scanner=new Scanner(System.in);
	
	
	public static void fileCreatOrRead() throws IOException {
		File file=new File("list.txt");
		if(file.createNewFile())
			System.out.println("file created");
		else
			System.out.println("file exist");
		
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("hello this is unordered list trying increase size of string");
		fileWriter.close();
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		while((readString=bufferedReader.readLine())!=null) {
			stringdummy=readString+stringdummy;
		}
		bufferedReader.close();
	}
	
	public static void main(String[] args) throws IOException {
	/* Generic UnOrdered List */
	List<String> list=new List<String>();
	/* Read data from file or if not there than create file*/
	fileCreatOrRead();
	/*Splitting sentence after space in words and saving as stringArray */
	String stringArrayForList[]=stringdummy.split("\\s");
	/*Insert words to list */
	for (int i = 0; i < stringArrayForList.length-1; i++) {
		
		list.insertAtEnd(stringArrayForList[i]);
	}
		
	/* Display list */	
	list.display();
	/* search word in list */
	System.out.println("please enter word to search");
	readString=scanner.next();
	
	if(list.search(readString)) {
		System.out.println("word is found and deleted from list");
		list.display();
	}
		
	else {
		System.out.println("word not found and added to list");
		list.insertAtEnd(readString);
	}
	
	}

}
