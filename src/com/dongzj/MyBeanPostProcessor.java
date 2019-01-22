package com.dongzj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor
 * 1、在<bean/>的init-method之前执行postProcessBeforeInitialization
 * 2、在<bean/>的init-method之后执行postProcessAfterInitialization
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/21
 * Time: 14:53
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！！");
    }

    /**
     * 在init-method之前调用
     *
     * @param o
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改");
        return o;
    }

    /**
     * 在init-method之后调用
     *
     * @param o
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改");
        return o;
    }
}
