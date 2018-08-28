package webmvc.observerpattern;

public class PatternMain {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        ReportDisplay reportDisplay=new ReportDisplay(weatherData);
        weatherData.mesurementChange();
    }
}
