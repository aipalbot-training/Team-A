package com.aipalbot.teamA.model;

import java.util.List;

public class ShoppingCart {

	private String name;
	private String customerId;
	
	public ShoppingCart(String name, String customerId) {
		
		this.name = name;
		this.customerId = customerId;
	}
	public String customerEmail;
	public String updateCustomer;
	public String addCustomer;
	public String deleteCustomer;
	public List<Item> items;

	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getUpdateCustomer() {
		return updateCustomer;
	}
	public void setUpdateCustomer(String updateCustomer) {
		this.updateCustomer = updateCustomer;
	}
	public String getAddCustomer() {
		return addCustomer;
	}
	public void setAddCustomer(String addCustomer) {
		this.addCustomer = addCustomer;
	}
	public String getDeleteCustomer() {
		return deleteCustomer;
	}
	public void setDeleteCustomer(String deleteCustomer) {
		this.deleteCustomer = deleteCustomer;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public String getCustomerId() {
		return customerId;
	}
	
	
}
