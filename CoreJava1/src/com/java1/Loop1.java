package com.java1;
import java.util.Scanner;
public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,reversed=0,input,p;
		double arms=0;
		System.out.println("Enter number ");
		num=sc.nextInt();
		input=num;
		while(num!=0)
        for(p=0;num>0;num=num/10)
		{
			int digit=num%10;
			//reversed=reversed*10+digit;
			//arms=arms+Math.pow(digit,3);
			p=(p*10)+digit;
			num/=10;
			
		}
		//System.out.println("rversed number  "+reversed);
		if(p==input)
		{
		System.out.println("is palindrome  "+input);
		}
		else
		{
			System.out.println("is not palindrome  "+input);
		}

		}
//		int i,fact=1;
//		System.out.println("Enter a Number");
//		int number=sc.nextInt();
//		
//		for(i=1;i<=number;i+=2)
//		{
//			//fact=fact*i;
//			System.out.println(" "+i);
//		}
//         //System.out.println(""+fact);
	}


