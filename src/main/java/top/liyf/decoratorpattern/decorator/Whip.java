package top.liyf.decoratorpattern.decorator;

import top.liyf.decoratorpattern.component.Beverage;

/**
 * @author liyf
 * Created in 2019-05-05
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
