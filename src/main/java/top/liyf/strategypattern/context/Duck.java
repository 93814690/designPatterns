package top.liyf.strategypattern.context;

import lombok.Setter;
import top.liyf.strategypattern.strategy.FlyBehavior;
import top.liyf.strategypattern.strategy.QuackBehavior;

/**
 * @author liyf
 * Created in 2019-04-12
 */
@Setter
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
