package com.globallogic.cleancode.solid.refactored;

import java.util.ArrayList;
import java.util.List;

import com.globallogic.cleancode.problem2.Customer;
import com.globallogic.cleancode.problem2.Order;
import com.globallogic.cleancode.problem2.Product;

public class CustomerOrderService {
	
	public double calculateOrderDiscount(List<Product> products, Customer customer){
		//do work
		return 0;
	}
	
	public List<String> gatherOrderErrors(List<Product> products, Customer customer){
		//do work
		return new ArrayList<String>();
	}
	
	public boolean isCustomerValid(Customer customer, Order order){
		//do work
		return false;
	}
}
