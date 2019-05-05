package top.liyf.decoratorpattern.decorator;

import top.liyf.decoratorpattern.component.Beverage;

/**
 * @author liyf
 * Created in 2019-05-04
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
