package top.liyf.observerpattern.observer;

import top.liyf.observerpattern.subject.Subject;
import top.liyf.observerpattern.subject.WeatherStation;

/**
 * @author liyf
 * Created in 2019-04-28
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay.weatherData = " + weatherData);
    }

    @Override
    public void update(Subject subject, Object arg) {
        if (subject instanceof WeatherStation) {
            this.weatherData = (WeatherData) arg;
            display();
        }
    }
}
