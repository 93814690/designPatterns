package top.liyf.strategypattern.context;

import top.liyf.strategypattern.strategy.impl.FlyNoWay;
import top.liyf.strategypattern.strategy.impl.Quack;

/**
 * @author liyf
 * Created in 2019-04-12
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
