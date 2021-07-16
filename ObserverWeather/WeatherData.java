package ObserverWeather;
import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0)
			observers.remove(i);
	}
	
	public void notifyObservers() {
		for (int i = 0; i<observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	public void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humi, float press) {
		this.temperature = temp;
		this.humidity = humi;
		this.pressure = press;
		measurementChanged();
	}
}
