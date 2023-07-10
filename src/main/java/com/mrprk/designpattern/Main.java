package com.mrprk.designpattern;

public class Main {

	public static void main(String[] args) {
		Constant constantObj1 = Constant.getConstantObj();
		Constant constantObj2 = Constant.getConstantObj();
		Constant constantObj3 = Constant.getConstantObj();

		System.out.println(constantObj1);
		System.out.println(constantObj2);
		System.out.println(constantObj3);

	}

}
