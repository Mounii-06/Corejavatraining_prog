package com.evergent.corejava.strings;
import java.util.Arrays;
public class StringDemo8 {
	public static void main(String[] args) {
		StringBuilder st=new StringBuilder();
		String a;
		String b;
		System.out.println('a'+'b');
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		System.out.println("a"+"b");
		String series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series=series+ch;
		}
		System.out.println(series);
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			st.append(i);
			System.out.print(ch);
		}
		String name="Java Technology";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println(" JAVA ".strip());
	}
}
