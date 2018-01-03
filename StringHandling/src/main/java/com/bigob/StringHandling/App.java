package com.bigob.StringHandling;

public class App {
	public static void main(String[] args) {
		String s = "Joker";
		System.out.println(s);
		/*
		 * Internally what will happen when we create a String When we create
		 * String s="joker" internally a char[] created with name value and
		 * store 'j','o','k','e','r'
		 */

		// String is immutable means we can't change the value of the String
		s.toUpperCase();
		System.out.println(s);// it will give Joker because String is Immutable

		/*
		 * when we create a String literal it will store in String pool area
		 * when same valued another string we create it will pointing to the
		 * same other pool area object means if i create a String with "a" then
		 * it will create a object reference in String pool and if i create
		 * another String "a" then that reference will pointed to newly created
		 * Object
		 */

		String s1 = "Joker";
		System.out.println(s1 == s);// it will print true because it is pointing
									// to the same object

		String s2 = new String("abc");
		System.out.println(s2);
		/*
		 * Here 2 object is created because when we call this constructor then
		 * public String(String original) constructor called so it will first
		 * create a String with value "abc" then call to the Constructor , then
		 * new keyword will create another constructor
		 */

		char[] value = { 'a', 'b', 'c', 'd' };
		String s3 = new String(value, 1, 2);// from the 1 position value to
											// ,upto next 2
		System.out.println(s3);
		// We can use StringBuffer and StringBuilder to create a String but this
		// is not widely use

		// length() --> it will return the length of the String
		System.out.println(s.length());

		// isEmpty() --> it will check weather String is empty or not
		System.out.println(s.isEmpty());

		// charAt() --> it will return character present in given index number
		System.out.println(s.charAt(1));

		// codePointAt() -->It will return ASCII code of the character in given
		// index number
		System.out.println(s.codePointAt(2));

		// equalIgnoreCase() --> it will check the given contain with other
		// String , with ignoring case
		System.out.println("jOKeR".equalsIgnoreCase(s));

		// compareTo() compare 2 String with Unicode based
		System.out.println(s.compareTo(s3));

		// compareToIgnoreCase() same as above but here case is not important
		System.out.println("joker".compareToIgnoreCase("JOKER"));

		// startWith() check weather the String start with given String or not
		// it is overloaded method same endsWith()
		System.out.println(s.startsWith("J"));
		
		//indexOf()  --> return index number of given character
		System.out.println(s.indexOf('o'));
	}
}
