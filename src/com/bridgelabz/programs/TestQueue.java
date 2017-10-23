package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Queue;
/******************************************************************************
 *  
 *  Purpose: To implement user defined generic queue
 *  			
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/

public class TestQueue {
	static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    Queue<Integer> queue=new Queue<Integer>();
	
	while(true) {
	System.out.println("\n1.Enqueue\n2.Dequeue\n3.display\n4.exit\n");	
		try {
			switch(scanner.nextInt()) 
			{
			
			case 1:	System.out.print("Enter the value:");
					queue.Enqueue(scanner.nextInt());	
				break;
			case 2:	queue.Dequee();
				break;
			case 3:	queue.display();
				break;
			case 4:	System.exit(0);
				break;
			default:
				System.out.println("Inavalid choice");
				break;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}   
    }
}
}