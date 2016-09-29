/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package annotation.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.TestObject;
import annotation.Repository.UserRepositoryImpl;
import annotation.controller.UserController;
import annotation.service.UserService;

/**
 * 
 * @author predix -
 */
public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");
	    Controller controller=(Controller)ctx.getBean("controller");
	    controller.run();
	    
	}
}
