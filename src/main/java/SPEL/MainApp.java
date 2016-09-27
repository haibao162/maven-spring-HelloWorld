/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * SPEL：字面量
整数：value=”#{5}”
小数：value=”#{89.5}”
科学计数法：value=”#{1e4}”
字符串：value=”#{‘Chuck’}”和value=’#{“Chunk”}’
Boolean:value=”#{false}”
引用Bean
引用其他对象:value=”#{prefix}”
引用其他对象的属性:value=”#{predix.suffix}”
引用其他属性的方法：value=”#{predix.toString().toUpperCase()}”
支持运算符，正则表达式
value=”#T(java.lang.Math).PI”

 */
public class MainApp {
public static void  main(String[] args){
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-SPEL.xml");
    Address address=(Address)ctx.getBean("address");
    System.out.println(address);
    Car car=(Car)ctx.getBean("car");
    System.out.println(car);
    Person person=(Person)ctx.getBean("person");
System.out.println(person);
}
}
