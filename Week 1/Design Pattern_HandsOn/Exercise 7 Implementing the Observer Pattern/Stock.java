package ObserverPattern;

public interface Stock {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
