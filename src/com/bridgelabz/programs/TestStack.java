package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Stack;
/******************************************************************************
 *  
 *  Purpose: To implement user defined generic stack
 *  			
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
public class TestStack {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();	
		
	       while(true) {
	            System.out.println("1.Push"
	                    + "\n2.Pop"
	                    + "\n3.Display"
	                    +"\n4.Peek"
	                    +"\n5.isEmpty"
	                    +"\n6.size"
	                     + "\n7.Exit\n");
	            switch(scanner.nextInt()) {
	                case 1: System.out.print("Enter value:");
	                			stack.push(scanner.nextInt());
	                        break;
	                case 2:// E element=st.pop();
	                		System.out.println(stack.pop()+" is poped"); 
	                        
	                        break;
	                
	                case 3: stack.display();
	                        break;
	                case 4:
	                		System.out.println("peek element="+stack.peek());
	                		break;
	                case 5:
	                		System.out.println("stack is empty "+stack.isEmpty());
	                		break;
	                case 6: System.out.println("size of stack "+stack.size());
	                		break;
	                case 7: System.exit(0);
	                
	                default: System.out.println("Invalid choice");
	                         break;
	            }
	            
		}
	}
	
}


