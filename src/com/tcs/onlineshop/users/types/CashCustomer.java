package com.tcs.onlineshop.users.types;

import com.tcs.onlineshop.users.Customer;

public class CashCustomer extends Customer {
	void printDetails(){
		System.out.println("Id "+id);
		System.out.println("Name "+name);
	}
}
