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

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 
 * @author predix -
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization:"+bean+","+beanName);
//		Car car=new Car();
//		car.setBrand("haibao162"); 
		return bean;   //bean
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization:"+bean+","+beanName);
		Car car=new Car();
//		car.setBrand("haibao164");
		//return car;
		return bean;
	}
	//return car;
//	1.car Constructor...
//	2.setBrand...
//	postProcessBeforeInitialization:Car [brand=toyota],car
//	1.car Constructor...
//	3.init...
//	postProcessAfterInitialization:Car [brand=null],car
//	4.开始使用BeanCar [brand=null]null
//	Sep 27, 2016 1:30:10 AM org.springframework.context.support.ClassPathXmlApplicationContext doClose
//	INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@4d405ef7: startup date [Tue Sep 27 01:30:10 PDT 2016]; root of context hierarchy
//	5.destory...
	
	//return bean;
//	1.car Constructor...
//	2.setBrand...
//	postProcessBeforeInitialization:Car [brand=toyota],car
//	1.car Constructor...
//	3.init...
//	postProcessAfterInitialization:Car [brand=toyota],car
//	4.开始使用BeanCar [brand=toyota]toyota
//	Sep 27, 2016 1:31:43 AM org.springframework.context.support.ClassPathXmlApplicationContext doClose
//	INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@4d405ef7: startup date [Tue Sep 27 01:31:42 PDT 2016]; root of context hierarchy
//	5.destory...
}
