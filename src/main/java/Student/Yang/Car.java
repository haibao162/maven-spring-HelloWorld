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
public class Car {
 private String brand;
 private String corp;
 private double price;
 /**
 * @return the maxSpeed
 */
public int getMaxSpeed() {
	return this.maxSpeed;
}
/**
 * @param maxSpeed the maxSpeed to set
 */
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
private int maxSpeed;
 public Car(String brand,String corp,double price){
	 this.brand=brand;
	 this.corp=corp;
	 this.price=price;
	 
 }
 public Car(String brand,String corp,int maxSpeed){
	 this.brand=brand;
	 this.corp=corp;
	 this.maxSpeed=maxSpeed;
	 
 }
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price
			+ ", maxSpeed=" + maxSpeed + "]";
}

}
