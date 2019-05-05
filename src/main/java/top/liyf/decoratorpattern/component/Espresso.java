package top.liyf.decoratorpattern.component;

/**
 * @author liyf
 * Created in 2019-05-04
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
