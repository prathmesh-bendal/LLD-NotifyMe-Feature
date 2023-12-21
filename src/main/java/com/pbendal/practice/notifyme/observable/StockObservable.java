package com.pbendal.practice.notifyme.observable;

import com.pbendal.practice.notifyme.observer.Observer;

public interface StockObservable {
	
	void add(Observer o);
	void remove(Observer o);
	void notifyObserver();
	void addStock(int val);
	

}
