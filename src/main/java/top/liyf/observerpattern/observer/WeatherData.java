package top.liyf.observerpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liyf
 * Created in 2019-04-28
 */
@Data
@AllArgsConstructor
public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;


}
