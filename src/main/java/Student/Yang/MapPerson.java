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

import java.util.Map;

/**
 * 
 * @author predix -
 */
public class MapPerson {
private String name;
private int age;
private Map<String,Car> cars;
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
/**
 * @return the cars
 */
public Map<String, Car> getCars() {
	return this.cars;
}
/**
 * @param cars the cars to set
 */
public void setCars(Map<String, Car> cars) {
	this.cars = cars;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "MapPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
}
}
