package com.dongzj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/21
 * Time: 17:51
 */
public class BeanLifeCycle {

    public static void main(String[] args) {
        System.out.println("现在开始初始化容器");

        ApplicationContext factory = new ClassPathXmlApplicationContext("file:/Users/dongzj/Workspaces/test/spring-test/web/WEB-INF/applicationContext.xml");
        System.out.println("容器初始化成功");

        //得到Person
        Person person = factory.getBean("person", Person.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器");
        ((ClassPathXmlApplicationContext) factory).registerShutdownHook();
    }
}
