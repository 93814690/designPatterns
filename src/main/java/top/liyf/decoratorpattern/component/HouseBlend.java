package top.liyf.decoratorpattern.component;

/**
 * @author liyf
 * Created in 2019-05-04
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
