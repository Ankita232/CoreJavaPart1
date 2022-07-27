package com.java1;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int f0=0;
			int f1=1,f2;
			for(int i=2;i<=20;i++)
			{
				f2=f1+f0;
				System.out.print(" "+f2);
				f0=f1;
				f1=f2;
				
				
			}
	}

}
