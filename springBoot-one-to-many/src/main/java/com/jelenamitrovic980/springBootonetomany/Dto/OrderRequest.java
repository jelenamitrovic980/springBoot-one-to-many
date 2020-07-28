package com.jelenamitrovic980.springBootonetomany.Dto;

import com.jelenamitrovic980.springBootonetomany.Entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
	
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	private  String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
		
		
	

}
