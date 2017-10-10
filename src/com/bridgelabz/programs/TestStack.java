package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Stack;

public class TestStack {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();	
		Scanner scanner=new Scanner(System.in);
	/*st.display();
      st.push(5);	
      st.push(6);
      st.push(7);
	  st.push(15);
	  st.display();
	  st.pop();
	   st.display();
	*/
		
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
	                       	//st.push(sc.nextInt());
	                			st.push(scanner.nextInt());
	                        break;
	                case 2:// E element=st.pop();
	                		System.out.println(st.pop()+" is poped"); 
	                        
	                        break;
	                
	                case 3: st.display();
	                        break;
	                case 4:
	                		System.out.println("peek element="+st.peek());
	                		break;
	                case 5:
	                		System.out.println("stack is empty "+st.isEmpty());
	                		break;
	                case 6: System.out.println("size of stack "+st.size());
	                		break;
	                case 7: System.exit(0);
	                
	                default: System.out.println("Invalid choice");
	                         break;
	            }
	            
		}
	}
	
}


