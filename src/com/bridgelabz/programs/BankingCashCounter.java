
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Queue;
import com.bridgelabz.util.Util;
/******************************************************************************
 *  
 *  Purpose: To deposit and withdraw amount from bank using queue for person
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class BankingCashCounter {
	public static boolean flag=true;
	public static Queue<Integer> queue=new Queue<Integer>();
	public static Integer cashBalance=1000;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {

		Queue< Integer> personQueue=new Queue<>();

		int size=0;
		while(flag) {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.display\n4.exit\n5.size of queue\n");	
			try {
				switch(scanner.nextInt()) 
				{

				case 1:	System.out.print("Enter the value:");
				queue.Enqueue(scanner.nextInt());	
				break;
				case 2:	if(queue.size==0) {
					System.out.println("queue empty");
					return;
				}
				System.out.println("Token no.:"+queue.Dequee());


				System.out.println("options\n 1.Withdraw\n 2.Deposit");

				switch(scanner.nextInt()) {
				case 1:System.out.println("the current balance is "+Util.withdraw(scanner.nextInt()));
				break;
				case 2:	
					System.out.println("amount deposited \n current balance="
							+Util.deposit(scanner.nextInt()));
					break;
				default:
					System.out.println("invalid");
				}

				break;
				case 3:	queue.display();
				break;
				case 4:	flag=false;
				break;
				case 5:System.out.println("size of queue="+queue.size);
				break;
				default:
					System.out.println("Inavalid choice");
					break;

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
				break;
			}


		}

	}

}
