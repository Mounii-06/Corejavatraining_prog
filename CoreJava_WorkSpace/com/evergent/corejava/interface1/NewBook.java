package com.evergent.corejava.interface1;
/*new book is extending myDataInfo so the methods 
 in myDataInfo will be acquired in the NewBook
 */
public interface NewBook extends myDataInfo{
	public void addBook();
	public void bookPrice();

}
