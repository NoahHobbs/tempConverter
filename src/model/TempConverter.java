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
		double cels = (temp - 32) * 1.8;
		this.celsius = cels;
		return cels;
	}
	public double getFarenheit() {
		return farenheit;
	}
	public double toFarenheit(double temp) {
		double faren = temp * 1.8 + 32;
		this.farenheit = faren;
		return faren;
	}
	
	public String farenToString() {
		double farenTemp = toFarenheit(this.temperature);
		return "TempConverter [Temperature in farenheit=" + farenTemp + "]";
	}
	
	public String celsToString() {
		double celsTemp = toCelsius(this.temperature);
		return "TempConverter [Temperature in celsius=" + celsTemp + "]";
	}
	
	
}
