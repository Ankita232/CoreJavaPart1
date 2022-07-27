package com.java1;
import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		char operator;
		double a,b,result;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		do
		{
			
		System.out.println("**Calculator**");
		System.out.println("Addition +");
		System.out.println("Subtraction -");
		System.out.println("Multiplication *");
		System.out.println("Division /");
		System.out.println("Enter first number: ");
		a=sc.nextDouble();
		System.out.println("Enter second number");
		b=sc.nextDouble();
		System.out.println("Put operator");
		operator = sc.next().charAt(0);
		}
		while(choice<'1'||
				
				
				)
		switch(operator)
		{
			case '+':
				result=a+b;
		        System.out.println(" "+result);
		        break;
			case '-':
				result=a-b;
		        System.out.println(" "+result);
		        break;
			case '*':
				result=a*b;
		        System.out.println(" "+result);
		        break;
			case '/':
				result=a/b;
		        System.out.println(" "+result);
		        break;
		    default: 
		    	System.out.println("Invalid operator");
		        
		        
		}

	}

}
