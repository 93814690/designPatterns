package top.liyf.strategypattern.context;

import org.junit.Test;
import top.liyf.strategypattern.strategy.impl.FlyRocketPowered;

import static org.junit.Assert.*;

/**
 * @author liyf
 * Created in 2019-04-12
 */
public class TestModelDuck {
    @Test
    public void test() {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}