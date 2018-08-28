package webmvc.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float press;
    private float humity;
    private float temprature;

    @Override
    public void registObserver(Observer observer) {
        observerList=new ArrayList<>();
        observerList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(press, temprature, humity);

        }
    }


    public void mesurementChange(){
        notifyObserver();
    }

    public void setReportCondition(float press,float humity,float temprature){
        this.press=press;
        this.humity=humity;
        this.temprature=temprature;
        mesurementChange();

    }
}
