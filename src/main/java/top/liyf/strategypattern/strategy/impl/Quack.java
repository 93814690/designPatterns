package top.liyf.strategypattern.strategy.impl;

import top.liyf.strategypattern.strategy.QuackBehavior;

/**
 * @author liyf
 * Created in 2019-04-12
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
