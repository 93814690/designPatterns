package top.liyf.decoratorpattern.decorator;

import top.liyf.decoratorpattern.component.Beverage;

/**
 * @author liyf
 * Created in 2019-05-04
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 用一个实例变量记录饮料，也就是被装饰者
     */
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
