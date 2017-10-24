package com.bridgelabz.programs;

import java.util.Scanner;
/****************************************************************************
 * 	Purpose: To calculate the number of binary can be made by N nodes
 * 
 * 
 *	@author Shritej
 *	@version 1.0
 *	@since 22-10-2017
 *
 *****************************************************************************/
public class BinaryTree {
	static long treeNumber;
	/**
	 * calculateBinaryTree method will calculate possible number of binary tree
	 * @param nodes
	 * @return {@value treeNumber}
	 */
	public double calculateBinaryTree(int nodes) {
	/**
	 * Formula used for binary tree=(2n)!/(n+1)!(n)! 
	 */
		treeNumber=(factorial(2*nodes))/(factorial(nodes+1)*factorial(nodes));
		return treeNumber;

	}
	/**
	 * factorial method will calculates factorial for binaryTree calculation
	 * @param number
	 * @return	{@value factorialResult}
	 */
	public int factorial(int number) {
		if(number==0)
			return 1;
		return number*factorial(number-1);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//creating object of class 
		BinaryTree binaryTree=new BinaryTree();
		System.out.print("Enter the number of nodes:");
		treeNumber=(long) binaryTree.calculateBinaryTree(scanner.nextInt());
		System.out.println("Binary tree can be possible:"+treeNumber);
		scanner.close();
	}
}
