package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.List;
/**
 * 
 * @author Shritej
 *	@since 6-10-2017
 */

public class TestUnOrderedList {
    public static void main(String[] args) {
    	
    	/* Generic UnOrdered List */
        List<Integer> list=new List<Integer>();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("1.Insert at first"
                    + "\n2.Insert at End"
                    + "\n3.Insert at position"
                    + "\n4.Delete at first"
                    + "\n5.Delete at End"
                    + "\n6.Diplay"
                    + "\n7.Delete at position"
                    + "\n8.Get size"
                    + "\n9. Search"
                    + "\n10.Exit\n");
            switch(sc.nextInt()) {
                case 1: System.out.print("Enter value:");
                        list.insertAtFirst(sc.nextInt());
                        break;
                case 2: System.out.print("Enter value:");
                        list.insertAtEnd(sc.nextInt());
                        break;
                case 3: System.out.print("Enter value and position");
                        list.insertAtPos(sc.nextInt(),sc.nextInt());
                        break;
                case 4: list.deleteAtFirst();
                        break;
                case 5: list.deleteAtEnd();
                        break;
                case 6: list.display();
                        break;
                case 7: list.deletByPosition(sc.nextInt());
                        break;
                case 8: System.out.println("size:"+list.size);
                        break;
                case 9:System.out.println("Enter value to search");
                		System.out.println("present:"+list.search(sc.nextInt()));
                		break;
                
                case 10: System.exit(0);
                
                default: System.out.println("Invalid choice");
                         break;
            }
        }
        
    }
    
}