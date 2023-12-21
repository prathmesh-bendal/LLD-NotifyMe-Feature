package com.pbendal.practice.notifyme.observer;


import com.pbendal.practice.notifyme.products.Product;

public class User implements Observer {
	
	private String username;
	

	public User(String username) {
		super();
		this.username = username;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public void update(Product product) {
		
		System.out.println("Greetings "+this.getUsername()+" new stock of "+product.getName()+" has just arrived");
		
	}

	
	

}
