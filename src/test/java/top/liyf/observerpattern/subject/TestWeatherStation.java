package top.liyf.observerpattern.subject;

import org.junit.Test;
import top.liyf.observerpattern.observer.CurrentConditionsDisplay;
import top.liyf.observerpattern.observer.StatisticsDisplay;
import top.liyf.observerpattern.observer.WeatherData;

import static org.junit.Assert.*;

/**
 * @author liyf
 * Created in 2019-04-28
 */
public class TestWeatherStation {

    @Test
    public void test() {
        WeatherStation weatherStation = WeatherStation.getInstance();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

        WeatherData weatherData = new WeatherData(80, 65, 30.4f);

        weatherStation.setMeasurements(weatherData);

        weatherData.setHumidity(70);
        weatherStation.setMeasurements(weatherData);
    }
}