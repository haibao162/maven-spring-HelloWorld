/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.Repository.UserRepositoryImpl;
import annotation.controller.UserController;
import annotation.service.UserService;

/*组件扫描：Spring能够从classpath下自动扫描，侦测和实例化具有特定注解的组件
@Component-基本注解，标识了一个受Spring管理的组件
@Respository：标识持久层组件
@Service：标识服务层（业务层）组件
@Controller：标识表现层组件
对于扫描的组件，默认命名策略：使用非限定类名，第一个字母小写，也可以在注解中通过value属性标识组件的名称

使用注解之后还需要在spring的配置文件中声明<context:component-scan>:
Base-package属性指定一个需要扫描的基类包，spring容器将会扫描这个基类包及其子包中的所有类
需要扫描多个包时，可以使用逗号分隔
如果扫描特定的类而不是包下的所有类可使用resource-pattern属性过滤特定的类
<context:component-scan base-package=”com.atguigu.spring.beans”
Resource-pattern=”autowire/*.class”/>
<context:include-filter>子节点表示要包含的目标类
<context:exclude-filter> 子节点表示要排除在外的目标类
他们在< context:component-scan >可以拥有若干个
*/
public class Main {
public static void main(String[] args){
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");
    
	TestObject to=(TestObject)ctx.getBean("testObject");
    System.out.println(to);
   // annotation.TestObject@5123a213
    
    UserController userController=(UserController)ctx.getBean("userController");
    System.out.println(userController);
    //annotation.controller.UserController@52525845
    
    UserService userService=(UserService)ctx.getBean("userService");
    System.out.println(userService);
    //annotation.service.UserService@3b94d659
    
    UserRepositoryImpl userRepositoryImpl=(UserRepositoryImpl)ctx.getBean("haibao162");
    //UserRepositoryImpl userRepositoryImpl1=(UserRepositoryImpl)ctx.getBean("userRepositoryImpl");
    System.out.println(userRepositoryImpl);
    //annotation.Repository.UserRepositoryImpl@24b1d79b
    userRepositoryImpl.save();
    //UserRepository Save...
    
    userController.execute();
    
}
}
