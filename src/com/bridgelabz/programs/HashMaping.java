package com.bridgelabz.programs;


import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;



public class HashMaping {

	public static void main(String[] args) throws IOException {
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
		}
	}


