package ObserverWeather;

public class Statistics implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;
	
	public Statistics(WeatherData wd) {
		this.weatherData = wd;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humi, float press) {
		tempSum += temp;
		numReadings++;
		
		if (temp > this.maxTemp)
			maxTemp = temp;
		if (temp < this.minTemp)
			this.minTemp = temp;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature= " + (this.tempSum / this.numReadings) + "/" + this.maxTemp
				+ "/" + this.minTemp);
	}
	
	public void remove() {
		this.weatherData.removeObserver(this);
	}
}
