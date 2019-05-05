package top.liyf.decoratorpattern.decorator;

import top.liyf.decoratorpattern.component.Beverage;

/**
 * @author liyf
 * Created in 2019-05-04
 */
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    /**
     * 功能描述: 饮料的描述
     *
     * @return java.lang.String
     * @author liyf
     */
    @Override
    public abstract String getDescription();
}
