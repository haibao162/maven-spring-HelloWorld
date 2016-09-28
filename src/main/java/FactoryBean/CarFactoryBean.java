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

import org.springframework.beans.factory.FactoryBean;

/**接口
 * 
 * @自定义的FactoryBean需要实现FactoryBean
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String brand;
    public void setBrand(String brand){
    	this.brand=brand;
    }
	//return bean
	public Car getObject()throws Exception{
	//return new Car("BMW",5000000);
	return new Car(brand,5000000);	
	}
	//bean type
	public Class<?> getObjectType(){
		return Car.class;
	}public boolean isSingleton(){
		return true;
	}
}
