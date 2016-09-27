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

/**
 * 
 * @author predix -
 */
public class Person {
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", city=" + city
				+ ", info=" + info + "]";
	}
/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @return the car
	 */
	public Car getCar() {
		return this.car;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return this.info;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
private String name;
private Car car;
//引用address bean的city属性
private String city;
//根据car的price确定info：car的price>=300000为金领，否则为白领
private String info;

}

