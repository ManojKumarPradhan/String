package com.bigob.StringHandling;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Manoj");
		System.out.println(buffer);
		
		//String is Immutable
		//StringBuffer and StringBuilder is Mutable
		//so when we need modification of String it will recommended to use StringBuffer/StringBuilder
		
		/*
		 * all the method here is synchronized so it is by default Thread-safe 
		 * So the performance of String Buffer is slower
		 * */
		//VS
		
		/*
		 * StringBuilder is not synchronized so it is not thread safe and
		 * performance of StringBuilder is faster
		 * */
		
		//lets do a performance test
		
		Long t1,t2,t3,t4;
		StringBuffer buffer2=new StringBuffer("1");
		t1=System.currentTimeMillis();
		for(int i=2;i<=6000000;i++){
			buffer2.append(i);
		}
		t2=System.currentTimeMillis();
		System.out.println("StringBuffer take "+(t2-t1)+" time ");
		System.out.println();
		StringBuilder builder=new StringBuilder("1");
		t3=System.currentTimeMillis();
		for(int i=2;i<=6000000;i++){
			builder.append(i);
		}
		t4=System.currentTimeMillis();
		System.out.println("StringBuilder take "+(t4-t3)+" time ");
		
	}
}
