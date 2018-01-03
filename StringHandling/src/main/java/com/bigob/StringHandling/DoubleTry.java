package com.bigob.StringHandling;

public class DoubleTry {

	public static void main(String[] args) {
		System.out.println(demo2(5));
	}

	@SuppressWarnings("finally")
	private static int demo2(int i) {
		while(i==5){
			try{
				i= 10;
				try {
					return i;
				} finally {
					return 20;
				}
			}catch (Exception e) {
				return 25;
			}finally {
				//System.out.println("hi");
				break;
			}
		}
		return 35;
	}
}
