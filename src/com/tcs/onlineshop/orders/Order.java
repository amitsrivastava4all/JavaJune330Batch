package com.tcs.onlineshop.orders;

public class Order {
	private int x = 100;
	public void orderSummary(){
		System.out.println("Order Summary is "+x);
		getItemDetails();
		discountDetails();
		Bill bill = new Bill();
		bill.printBill();
	}
	
	void getItemDetails(){
		System.out.println("U Bought 2 Items");
	}
	void discountDetails(){
		System.out.println("10% Off");
	}
}
