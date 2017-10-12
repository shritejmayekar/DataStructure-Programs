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
		System.out.println("please enter the size of queue");
		size=scanner.nextInt();
		for(int token=1;token<=size;token++) {
			personQueue.Enqueue(token);
			
		}
		for(int token=1;token<=personQueue.size;token++) {
			Random randdom=new Random();
			cashBalance=randdom.nextInt(50000);
			queue.Enqueue(cashBalance);
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
			
		}
		

	}

}
