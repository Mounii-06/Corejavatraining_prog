package com.evergent.corejava.generalprogramming;
enum COLORS{
	RED,GREEN,BLUE;
}
enum Myplaces{
	HYDERABAD,VIJAYWADA,VIZAG;
}
enum MONTH{
	jan,feb,march,april,may;
}
enum NEWS{
	north,east,west,south;
}
public class Myname6 {
	public static void main(String[] args) {
		COLORS c=COLORS.GREEN;
		System.out.println(c);
		Myplaces my=Myplaces.HYDERABAD;
		System.out.println(my);
		MONTH mo=MONTH.jan;
		System.out.println(mo);
		NEWS ne=NEWS.east;
		System.out.println(ne);
		

	}

}
