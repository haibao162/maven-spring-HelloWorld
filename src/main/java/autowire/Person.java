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

/**
 * 
 * @author predix -
 */
public class Person {
private String name;
private Address address;
private Car car;
public void setName(String name){
	this.name=name;
}
public String getName(){
	return this.name;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", car=" + car
			+ "]";
}
public void setAddress(Address address){
	this.address=address;
}
public Address getAddress(){
	return this.address;
}
public void setCar(Car car){
	this.car=car;
	}
}
