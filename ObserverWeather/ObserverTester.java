package ObserverWeather;

public class ObserverTester {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentConditions cd = new CurrentConditions(wd);
		Statistics st = new Statistics(wd);
		Forecast fr = new Forecast(wd);
		
		wd.setMeasurements(80, 60, 30.4f);
		fr.remove();
		wd.setMeasurements(82, 70, 29.2f);
		wd.setMeasurements(78, 90, 29.2f);

	}

}
