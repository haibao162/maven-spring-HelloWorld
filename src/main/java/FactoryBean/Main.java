/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author predix -
 */
public class Main {
public static void main(String[] args){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-beanfactory.xml");
	Car car=(Car)ctx.getBean("factorybean");
	System.out.println(car);
	
}
}
