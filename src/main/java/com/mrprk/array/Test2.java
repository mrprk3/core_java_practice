package com.mrprk.array;

public class Test2 {
	public static void main(String[] args) {
		String ss = "1234 - Shopping,5456 - Test3,1234 - Shopping,8999 - Test1,12390 - Test2";
		String[] split = ss.split(" - ");
		for(String s: split) {
			System.out.println(s);
		}
	}

}
