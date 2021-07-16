package ObserverWeather;

public class CurrentConditions implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditions(WeatherData wd) {
		this.weatherData = wd;
		this.weatherData.registerObserver(this);
	}
	
	public void update(float temp, float humi, float press) {
		this.temperature = temp;
		this.humidity = humi;
		display();
	}
	
	public void display() {
		System.out.println("Current Conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity");
	}
	
	public void remove() {
		this.weatherData.removeObserver(this);
	}
}
