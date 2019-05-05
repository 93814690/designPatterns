package top.liyf.decoratorpattern;

import org.junit.Test;
import top.liyf.decoratorpattern.component.Beverage;
import top.liyf.decoratorpattern.component.Espresso;
import top.liyf.decoratorpattern.component.HouseBlend;
import top.liyf.decoratorpattern.decorator.Mocha;
import top.liyf.decoratorpattern.decorator.Soy;
import top.liyf.decoratorpattern.decorator.Whip;

import static org.junit.Assert.*;

/**
 * @author liyf
 * Created in 2019-05-05
 */
public class TestEspresso {

    @Test
    public void test() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());
    }
}