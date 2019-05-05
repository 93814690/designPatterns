package top.liyf.decoratorpattern.component;

/**
 * @author liyf
 * Created in 2019-05-04
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 功能描述: 价钱
     *
     * @return double
     * @author liyf
     */
    public abstract double cost();
}
