package org.example;

import org.springframework.beans.factory.annotation.Autowired;

//这个模块要完成功能 依赖于OD
public class OrderService {
    /*一个注解只是提供一小段信息
    * 注解是动态的在运行时被人扫描来完成工作
    * 告诉S bean之间的依赖关系
    * S会自动完成装配的工作*/
    @Autowired
    private OrderDao orderDao;
    public void doS(){
        orderDao.select();
    }
}
