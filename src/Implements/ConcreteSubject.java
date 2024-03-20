package Implements;

import java.util.ArrayList;
import java.util.List;
import interfaces.Observer;
import interfaces.Subject;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String notification;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }

    public void setNotification(String notification) {
        this.notification = notification;
        notifyObservers();
    }

	@Override
	public void addObserver1(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver1(Observer observer) {
		// TODO Auto-generated method stub
		
	}
}
