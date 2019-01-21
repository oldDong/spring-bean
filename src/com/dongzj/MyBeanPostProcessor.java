package com.dongzj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
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

    @Override
    public Object postProcessBeforeInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改");
        return o;
    }
}
