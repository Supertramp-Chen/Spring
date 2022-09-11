package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    //spring核心接口 beanfactory
    //CPXA实现该接口，接受一个xml的路径
    public static void main(String[] args) {
        //创建容器，拿到容器对象本身
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:config.xml");
        //从容器里拿东西，向容器对象索要一个name为od的bean
        //已经声明依赖关系，拿到bean的时候 其中的依赖关系已经装配好了
        OrderService orderService = (OrderService) beanFactory.getBean("orderDao");
        //少了手动new对象 和管理依赖的步骤，告诉S bean之间的依赖关系
        //只是告诉spring有这个对象，直接拿
        //默认情况下是单例，什么时候拿都是同一个对象
        System.out.println(orderService);
        orderService.doS();
    }
}
