package com.java1;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,col,i,j;
		int arr[][]=new int[10][10];
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the array is \n");
		for(int k=0;k<row;k++) {
			for(int l=0;l<col;l++)
			{
				System.out.println(arr[k][l]+" ");
			}
			System.out.println();
			
			
			
			
			
			
			
			
			
			
		}

	}

}
