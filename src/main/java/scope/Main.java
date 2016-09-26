/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * 
 * @author predix -
 */
public class Main {
public static void main(String[] args){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-scope.xml");
	//Car Constructor,如果是单例模式singleton，会一开始就初始化
	Car car1=(Car)ctx.getBean("car");//Car Constructor
System.out.println(car1);
Car car2=(Car)ctx.getBean("car");//Car Constructor
System.out.println(car1==car2);//scope,singleton:false,prototype:false
}
}
