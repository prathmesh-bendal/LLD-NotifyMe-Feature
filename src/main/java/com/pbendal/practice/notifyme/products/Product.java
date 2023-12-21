package com.pbendal.practice.notifyme.products;

import java.util.ArrayList;
import java.util.List;

import com.pbendal.practice.notifyme.observable.StockObservable;
import com.pbendal.practice.notifyme.observer.Observer;

public abstract class Product implements StockObservable {
	
	private String name;
	private String description;
	private double price;
	private int stock;
	private List<Observer> subscribers;
	
	public Product(String name, String description, double price, int stock) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.subscribers=new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public List<Observer> getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(List<Observer> subscribers) {
		this.subscribers = subscribers;
	}
	
	@Override
	public void add(Observer o) {
		this.getSubscribers().add(o);	
	}

	@Override
	public void remove(Observer o) {
		this.getSubscribers().remove(o);
	}
	
	@Override
	public void addStock(int val) {
		this.setStock(this.getStock()+val);	
		if(this.getStock()==val)
		{
			notifyObserver();
		}
	}
	
	@Override
	public void notifyObserver() {
		
		for(Observer o:this.getSubscribers())
		{
			o.update(this);
		}
	}
	
	
	
	

}
