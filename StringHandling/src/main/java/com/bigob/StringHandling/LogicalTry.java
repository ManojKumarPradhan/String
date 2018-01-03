package com.bigob.StringHandling;

public class LogicalTry {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int i;
		try {
			i = 30;
			System.out.println("in try");
		} catch (Exception e) {
			// System.out.println(i);
		}
		// System.out.println(i);
		// if we initialize variable in try block then compiler might confused
		// weather the line execute or not in runtime so it will detect error 
	}
}
