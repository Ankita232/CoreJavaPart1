package com.java;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str=new String("i like java");
        String emptystr=" ";
        String s="java";
        //System.out.println("string "+emptyStr.isEmpty());
        //System.out.println("string "+emptyStr.isBlank());
        //System.out.println("String"+ s.stripLeading());
        //System.out.println("String"+ s.stripTrailing());
        System.out.println(s.repeat(4));
        
        char[]dest=new char[4];
        s.getChars(0,4,dest,0);
        System.out.println(Arrays.toString(dest));
        //String s1="Iot";
        System.out.println(s.toCharArray());
        
      
	}

}
