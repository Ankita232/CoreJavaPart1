package com.java;

public class VariableTypes {
	static int num1=99; //static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=96; //instance variable
		method1();
		System.out.println("num1 is: "+VariableTypes.num1);
		System.out.println(num);
			
	}
	public static void method1() {
		
		int num2=69; //local variable
		System.out.println("num2 is: "+(++num2));
	}

}
