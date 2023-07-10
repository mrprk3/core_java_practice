package com.mrprk.designpattern;

public class Constant {

	private static Constant obj = new Constant();

	private Constant() {

	}

	public static Constant getConstantObj() {
		return obj;
	}

}
