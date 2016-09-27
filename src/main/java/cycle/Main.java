/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 添加Bean后置处理器后，Spring IOC容器对Bean的生命周期进行管理的过程：
1.通过构造器或工厂方法创建Bean实例
2.为Bean的属性设置值和对其他Bean的引用
3.将Bean实例传递给Bean后置处理器的postProcessBeforeInitialization方法
4.调用Bean的初始化方法
5.将Bean实例传递给Bean后置处理器的PostProcessAfterInitialization方法
6.Bean可以使用了
7.当容器关闭时，调用Bean的销毁方法

 */
public class Main {
public static void main(String[] args){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
	Car car=(Car)ctx.getBean("car");
	System.out.println("4.开始使用Bean"+car.toString()+car.getBrand());
	//5.关闭容器
	((AbstractApplicationContext) ctx).close();
//	1.car Constructor...
//	2.setBrand...
//	postProcessBeforeInitialization:Car [brand=toyota],car
//	1.car Constructor...
//	2.setBrand...
//	3.init...
//	postProcessAfterInitialization:Car [brand=haibao164],car
//	1.car Constructor...
//	2.setBrand...
//	4.开始使用BeanCar [brand=haibao164]haibao164
//	Sep 27, 2016 1:26:08 AM org.springframework.context.support.ClassPathXmlApplicationContext doClose
//	INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@4d405ef7: startup date [Tue Sep 27 01:26:07 PDT 2016]; root of context hierarchy
//	5.destory...
	
	

}
}
