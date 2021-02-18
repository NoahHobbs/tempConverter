package model;

public class TempConverter {
	private double temperature;
	private double celsius;
	private double farenheit;
	
	public TempConverter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TempConverter(double temperature) {
		super();
		this.temperature = temperature;
		setTemperature(temperature);
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getCelsius() {
		return celsius;
	}
	public double toCelsius(double temp) {
		// This function will change the temperature passed to it as a parameter to a Celsius temperature
		// The return value is the rounded result of the Fahrenheit to Celsius formula
		double cels = (temp - 32) / 1.8;
		this.celsius = cels;
		return Math.round(cels);
	}
	public double getFarenheit() {
		return farenheit;
	}
	public double toFarenheit(double temp) {
		// This function will change the temperature passed to it as a parameter to a Fahrenheit temperature
		// The return value is the rounded result of the Celsius to Fahrenheit formula
		double faren = temp * 1.8 + 32;
		this.farenheit = faren;
		return Math.round(faren);
	}
	
	public String farenToString() {
		//getting the Fahrenheit attribute along with a string for output
		double farenTemp = toFarenheit(this.temperature);
		return "TempConverter [Temperature in farenheit=" + farenTemp + "]";
	}
	
	public String celsToString() {
		// getting the Celsius attribute along with a string for output
		double celsTemp = toCelsius(this.temperature);
		return "TempConverter [Temperature in celsius=" + celsTemp + "]";
	}
	
	
}
