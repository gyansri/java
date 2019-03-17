package com.string;

import java.util.*;
public class DuplicateRemoveFromString {

	public static void main(String[] args) {
		String str;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String:");
		str=s.next();
		RemoveDuplicate rd=new RemoveDuplicate();
		System.out.print("After removing the duplicate character new  String is:"+rd.m1(str));
	}
}
 class RemoveDuplicate{
	public String m1(String str){
		Set<Character> st=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character ch=str.charAt(i);
			if(!st.contains(ch)){
			st.add(ch);
			sb.append(ch);
		}
		}
		return sb.toString();
	}
}
