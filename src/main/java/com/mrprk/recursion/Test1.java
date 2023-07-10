package com.mrprk.recursion;

public class Test1 {
	public static void main(String[] args) {
		printNos1(10);
	}
	
	public static int count = 1;
	  public static void printNos(int N)
	    {
	        if(N==0){
	            return;
	        }else{
	            System.out.print(count+" ");
	            N--;
	            count++;
	            printNos(N);
	        }
	    }
	  
	  
	  public static void printNos1(int N)
	    {
	        if(N==count){
	            return;
	        }else{
	            System.out.print(count+" ");
	            count++;
	            printNos(N);
	        }
	    }
}
