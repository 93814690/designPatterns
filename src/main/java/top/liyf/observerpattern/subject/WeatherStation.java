package top.liyf.observerpattern.subject;

import top.liyf.observerpattern.observer.Observer;
import top.liyf.observerpattern.observer.WeatherData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyf
 * Created in 2019-04-28
 */
public class WeatherStation implements Subject {

    private WeatherData weatherData;
    private boolean changed = false;
    private List<Observer> list = new ArrayList<>();

    private WeatherStation() {
    }

    private static class SingletonHolder {
        private static final WeatherStation INSTANCE = new WeatherStation();
    }

    public static WeatherStation getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 功能描述: 当气象站更新数据时，通知观察者
     *
     * @param
     * @return void
     * @author liyf
     */
    public void measurementsChanged() {
        setChanged();
        notifyObserver(weatherData);
    }

    /**
     * 功能描述: 更新数据
     *
     * @param weatherData 天气数据
     * @return void
     * @author liyf
     */
    public void setMeasurements(WeatherData weatherData) {
        this.weatherData = weatherData;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver(Object arg) {
        if (changed) {
            for (Observer observer : list) {
                observer.update(this, arg);
            }
        }
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public void clearChanged() {
        changed = false;
    }

    @Override
    public boolean hasChanged() {
        return changed;
    }


}
