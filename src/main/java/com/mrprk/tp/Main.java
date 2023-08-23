package com.mrprk.tp;

public class Main {
	public static void main(String[] args) {

		String daysForActivationType = "08/16/2023";

		if (DateUtil.isLessThanOrEqualsCurrentDate(daysForActivationType)) {
			System.out.println("Suspend");
		} else {
			System.out.println("Active");
		}
	}

}
