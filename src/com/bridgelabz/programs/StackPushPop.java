package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.util.Stack;
/******************************************************************************
 *  
 *  Purpose: To check balanced parenthesis in expression
 *  			
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   06-10-2017
 *
 ******************************************************************************/
public class StackPushPop {
	public static Character ch;
	public static int counterOpening,counterClosing;
	public static String expression;
	public static void main(String[] args) {
		Stack<Object> stack=new Stack<Object>();	
		Scanner scanner=new Scanner(System.in);
		System.out.print("please enter expression:");
		expression=scanner.next();
	
		char expressionCharArray[]=expression.toCharArray();
		for(int i=0;i<expressionCharArray.length;i++) {
			if(expressionCharArray[i]=='(') {
				stack.push(expressionCharArray[i]);
				counterOpening++;
				
			}
			else if(expressionCharArray[i]==')') {
				System.out.print(stack.pop()+" ");
				counterClosing++;
			}
		}
	
		stack.display();
		if(counterOpening==counterClosing && stack.isEmpty())
			System.out.println("balanced equation");
		else
			System.out.println("not balanced equation");
		scanner.close();
	}
	
}
