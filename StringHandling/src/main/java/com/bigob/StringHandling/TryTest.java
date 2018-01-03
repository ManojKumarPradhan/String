package com.bigob.StringHandling;

public class TryTest {

	public static void main(String[] args) {
		System.out.println(demo(1));
	}

	@SuppressWarnings("finally")
	private static int demo(int i) {
		while(i==1){
			try{
				return 2;
			}catch(Exception e){
				return 3;
			}finally {
				break;
			}
		}
		return 5;
	}
}
