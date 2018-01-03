package com.bigob.StringHandling;

public class TryFinallyTest {

	public static void main(String[] args) {
		try{
			System.out.println("in try block");
			System.out.println();
			System.out.println(10/0);
		}catch (NullPointerException e) {
			System.out.println("in catch block");
		}finally {
			System.out.println("in finally block");
			int[] i=new int[-9];
			System.out.println(i);
		}
		
		/*
		 * it will print NegetiveArraySizeException because in try block 
		 * the Exception will store in JDH variable to print finally block
		 * if finally block don't have any exception then that JDH value 
		 * will print but we have a Exception like NegetiveArraySizeExceptin 
		 * so JDH replace ArthimaticException with NegetiveArraySizeException
		 * */
	}
}
