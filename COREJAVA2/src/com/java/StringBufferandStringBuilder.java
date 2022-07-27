package com.java;

import java.util.Calendar;

public class StringBufferandStringBuilder{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc=new Scanner(System.in);
		long startingTime = System.currentTimeMillis();
		StringBuffer sbuffer=new StringBuffer("hello");
		for(int i=0;i<1000;i++)
		{
			sbuffer.append("Java");
		}
        System.out.println("Time consumed by StringBuffer: "+(System.currentTimeMillis()-startingTime)+"milliseconds");
        startingTime = System.currentTimeMillis();
		StringBuilder sbuilder=new StringBuilder("hello");
		for(int i=0;i<1000;i++)
		{
			sbuilder.append("Python");
		}
        System.out.println("Time consumed by StringBuilder: "+(System.currentTimeMillis()-startingTime)+"milliseconds");
	    System.gc();
	    StringBuilder StringBuilder=new StringBuilder("Ankita");
	    long startTime1 = Calendar.getInstance().getTimeInMillis();
	    for(long i=0;i<10000000;i++)
	    {
	    	StringBuilder.append(i);	
	    }
	    long endTime1=Calendar.getInstance().getTimeInMillis();
	    System.out.println("Time taken for 10000000 appends for StringBuilder: "+(endTime1-startTime1)+"ms");
	    
	    StringBuffer StringBuffer=new StringBuffer("Ankita");
	    long startTime2 = Calendar.getInstance().getTimeInMillis();
	    for(long i=0;i<10000000;i++)
	    {
	    	StringBuffer.append(i);	
	    }
	    long endTime2=Calendar.getInstance().getTimeInMillis();
	    System.out.println("Time taken for 10000000 appends for StringBuilder: "+(endTime2-startTime2)+"ms");

	}
	

}
