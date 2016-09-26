/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author predix -
 */
public class MainApp {
public static void  main(String[] args){
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-autowire.xml");
    Person person=(Person)ctx.getBean("person");
System.out.println(person);
Address address=(Address)ctx.getBean("address2");
System.out.println(address);
//address extends address bean.
 address=(Address)ctx.getBean("address3");
System.out.println(address);
  person=(Person)ctx.getBean("person2");
System.out.println(person);//car=null
}
}
