package com.howard.test;
public class StringTest {
	
	public static void main(String[] args) {
		String str="hello";
		str+="oo";
		str+="xx";
		System.out.println(str.getClass());
		System.out.println(str);
		StringBuffer sb=new StringBuffer();
		sb.append("aa");
		sb.append("bb");
		sb.toString();
		System.out.println(sb.toString());
	}
}
