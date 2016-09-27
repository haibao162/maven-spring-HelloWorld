/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 配置bean：基于XML文件的方式，基于注解的方式
Bean的配置方式：通过全类名（反射），通过工厂方法（静态工厂，实例工厂），FactoryBean

 */
public class Main {
public static void main(String[] args){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-factory.xml");
    
	//静态工厂
	Car car1=(Car)ctx.getBean("car1");
    System.out.println(car1);//Car [brand=haibao164, price=500000.0]
    /**
     * 实例工厂方法：将对象的创建过程封装到另外一个对象实例的方法里。
       当客户请求对象时，只需要简单的调用该实例方法而不需要关心对象的创建细节。
       要声明通过实例工厂方法创建的Bean
       在bean的factory-bean属性里指定拥有该工厂方法的Bean
       在factory-method属性里指定该工厂方法的名称
       使用constructor-arg元素为工厂方法传递方法参数

     */
    Car car2=(Car)ctx.getBean("car2");
    System.out.println(car2);
}
}
