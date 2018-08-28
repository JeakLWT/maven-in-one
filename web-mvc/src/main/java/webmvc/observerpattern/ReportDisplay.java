package webmvc.observerpattern;

public class ReportDisplay implements Observer,DisplayElement{
    private Subject weatherData;
    private float press;
    private float temprature;
    private float humidity;

    public ReportDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    @Override
    public void display() {
        System.out.println("=========");
    }

    @Override
    public void update(float press, float temprature, float humidity) {
        this.humidity=humidity;
        this.press=press;
        this.temprature=temprature;
        display();

    }
}
