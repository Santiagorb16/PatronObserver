package interfaces;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
	void addObserver1(Observer observer);
	void removeObserver1(Observer observer);
}