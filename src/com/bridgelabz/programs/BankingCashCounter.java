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
package com.bridgelabz.programs;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.util.Queue;

public class BankingCashCounter {
	public static Queue<Integer> queue=new Queue<Integer>();
	public static Integer cashBalance=1000;
	public static int withdraw(Integer amount) {
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
		if(amount>0) {
			cashBalance=cashBalance+amount;
			
		}
		return cashBalance;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Queue< Integer> personQueue=new Queue<>();
		
		int size=0;
		while(true) {
			System.out.println("\n1.Enqueue\n2.Dequeue\n3.display\n4.exit\n5.size of queue\n");	
			switch(scanner.nextInt()) 
			{
			
			case 1:	System.out.print("Enter the value:");
					queue.Enqueue(scanner.nextInt());	
				break;
			case 2:	System.out.println("Token no.:"+queue.Dequee());
					Random randdom=new Random();
					cashBalance=randdom.nextInt(50000);
					System.out.println("options\n 1.Withdraw\n 2.Deposit");
					
					switch(scanner.nextInt()) {
						case 1:System.out.println("the current balance is "+withdraw(scanner.nextInt()));
							break;
						case 2:	
								System.out.println("amount deposited \n current balance="
											+deposit(scanner.nextInt()));
								break;
						default:
							System.out.println("invalid");
					}
					
				break;
			case 3:	queue.display();
				break;
			case 4:	System.exit(0);
				break;
			case 5:System.out.println("size of queue="+queue.size);
				break;
			default:
				System.out.println("Inavalid choice");
				break;

			}

		            
		}

	}

}
