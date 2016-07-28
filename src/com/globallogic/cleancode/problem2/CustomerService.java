package com.globallogic.cleancode.problem2;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
	private OrderSubmissionService orderSubmissionService;

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
	
	public void submitOrder(Order order)
	{
	    // make sure that the order has products
	    if (order.getPoducts().size() == 0)
	    {
	        throw new IllegalArgumentException(
	            "Select a product.");
	    }
	    
	    // calculate tax
	    order.setTax(order.getSubTotal() * 1.0675);
	    
	    // calculate shipping
	    if (order.getSubTotal() < 25)
	        order.setShippingCharges(5);
	    else
	        order.setShippingCharges(10);
	        
	    // submit the order
	    orderSubmissionService.submitOrder(order);
	}

	
	public void register(Customer customer){
		//do work
	}
	
	public void forgotPassword(Customer customer){
		//do work
	}
}
