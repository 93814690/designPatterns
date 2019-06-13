package top.liyf.factorypattern.simplefactory;

import top.liyf.factorypattern.PizzaType;

/**
 * @author liyf
 * Created in 2019-06-12
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (PizzaType.CHEESE.equals(type)) {
            pizza = new CheesePizza();
        } else if (PizzaType.CLAM.equals(type)) {
            pizza = new ClamPizza();
        }

        return pizza;
    }
}
