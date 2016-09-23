/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package Student.Yang;

/**
 * 
 * @author predix -
 */
public class Person {
private String name;
private int age;
private Car car;
/**
 * @return the car
 */
public Car getCar() {
	return this.car;
}
/**
 * @param car the car to set
 */
public void setCar(Car car) {
	this.car = car;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
}
/**
 * @return the name
 */
public String getName() {
	return this.name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
public int getAge() {
	return this.age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
Person(){
	}
/**
 * @param name
 * @param age
 * @param car -
 */
public Person(String name, int age, Car car) {
	super();
	this.name = name;
	this.age = age;
	this.car = car;
}

}
