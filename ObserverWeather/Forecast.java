package ObserverWeather;

public class Forecast implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public Forecast(WeatherData wd) {
		this.weatherData = wd;
		this.weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humi, float press) {
		lastPressure = currentPressure;
		currentPressure = press;
		display();
	}
	
	public void display() {
		System.out.println("Forecast: ");
		if (this.currentPressure > this.lastPressure) 
			System.out.println("Improving weather on the way!");
		else if (this.currentPressure == this.lastPressure) 
			System.out.println("More of the same");
		else 
			System.out.println("Watch out for cooler, rainy weather");
	}
	
	public void remove() {
		this.weatherData.removeObserver(this);
	}
}
