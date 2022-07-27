package com.java1;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=5;i++) {
			for(int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
			System.out.print("*");
		}
			System.out.println();
		
		}
//		int sum=0;
//		for(int i=1;i<=5;i++)
//		
//		{
//			System.out.println(sum+i);
//		}
		
		
		
		
	}

}
