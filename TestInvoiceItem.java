package com.exercises.pll;

import com.exercises.bll.InvoiceItem;

public class TestInvoiceItem {

	public static void main(String[] args) {
		InvoiceItem i1 = new InvoiceItem("101-pcm-500","Paracetamol",10,150);
		System.out.println(i1.toString());// print toString method
		System.out.println("Unit Price="+i1.getUnitPrice());//unit price
		System.out.println("Total Price="+i1.getTotal());//total price
	}

}
