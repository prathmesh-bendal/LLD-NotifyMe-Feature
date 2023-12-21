package com.pbendal.practice.notifyme;

import com.pbendal.practice.notifyme.observer.User;
import com.pbendal.practice.notifyme.products.Iphone;
import com.pbendal.practice.notifyme.products.MacBook;

public class Main {

	public static void main(String[] args) {
		
		Iphone iphone=new Iphone("Iphone 14 max pro", "apple iphone", 1234.5, 0);
		MacBook macBook=new MacBook("MacBook 16 Air", "apple laptop", 2500, 0);
		User u1=new User("user1");
		User u2=new User("user2"); 
		User u3=new User("user3"); 
		
		iphone.add(u1);
		iphone.add(u2);
		
		macBook.add(u3);
		
		iphone.addStock(10);
		System.out.println("------------------");
		iphone.addStock(2);
		iphone.setStock(0);
		macBook.addStock(3);
		System.out.println("-------------------");
		iphone.addStock(5);
		macBook.setStock(0);
		System.out.println("-------------------");
		macBook.addStock(7);

	}

}
