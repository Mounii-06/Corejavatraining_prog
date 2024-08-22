package com.evergent.corejava.strings;
public class StringBuiderExam {
	public static void main(String[] args) {
		StringBuilder st=new StringBuilder("Hai");
		System.out.println("Intial String:"+st);
		st.append(" World!");
		System.out.println("after append:"+st);
		st.insert(4, "mouni");
		System.out.println("after insertion:"+st);
		st.replace(0,3,"Hello");
		System.out.println("after replacing:"+st);
		st.delete(0, 5);
		System.out.println("after deleting:"+st);
		st.reverse();
		System.out.println("after reverse:"+st);
		System.out.println("Capacity:"+st.capacity());
		System.out.println("Length:"+st.length());		
	}
}
