/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package cycle;

/**
 * 
 * @author predix -
 */
public class Car {
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
public Car(){
	
	System.out.println("1.car Constructor...");
}
private String brand;
public void setBrand(String brand){
	System.out.println("2.setBrand...");
	this.brand=brand;
}
public void init2(){
	System.out.println("3.init...");
}
public void destory(){
	System.out.println("5.destory...");
}
public String getBrand(){
	return brand;
}
}
