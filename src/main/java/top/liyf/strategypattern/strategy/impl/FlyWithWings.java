package top.liyf.strategypattern.strategy.impl;

import top.liyf.strategypattern.strategy.FlyBehavior;

/**
 * @author liyf
 * Created in 2019-04-12
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
