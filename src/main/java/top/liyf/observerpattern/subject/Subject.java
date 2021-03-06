package top.liyf.observerpattern.subject;


import top.liyf.observerpattern.observer.Observer;

/**
 * @author liyf
 * Created in 2019-04-28
 */
public interface Subject {

    /**
     * 功能描述: 注册观察者
     *
     * @param o 观察者
     * @return void
     * @author liyf
     */
    void registerObserver(Observer o);

    /**
     * 功能描述: 删除观察者
     *
     * @param o 观察者
     * @return void
     * @author liyf
     */
    void removeObserver(Observer o);

    /**
     * 功能描述: 通知所有的观察者
     *
     * @param
     * @return void
     * @author liyf
     */
    default void notifyObserver() {
        notifyObserver(null);
    }

    /**
     * 功能描述: 通知所有的观察者
     *
     * @param arg 推送的数据
     * @return void
     * @author liyf
     */
    void notifyObserver(Object arg);

    /**
     * 功能描述: 标记被观察者对象已经改变
     *
     * @param
     * @return void
     * @author liyf
     */
    void setChanged();

    /**
     * 功能描述:清除改变状态
     *
     * @param
     * @return void
     * @author liyf
     */
    void clearChanged();

    /**
     * 功能描述: 查询被观察者对象是否改变
     *
     * @param
     * @return boolean
     * @author liyf
     */
    boolean hasChanged();
}
