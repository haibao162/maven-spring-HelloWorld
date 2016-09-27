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
public class Car {
/**
	 * @return the tyrePerimeter
	 */
	public double getTyrePerimeter() {
		return this.tyrePerimeter;
	}
	/**
	 * @param tyrePerimeter the tyrePerimeter to set
	 */
	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter="
				+ tyrePerimeter + "]";
	}
/**
	 * @return the brand
	 */
	public String getBrand() {
		return this.brand;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return this.price;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
private String brand;
private Double price;
private double tyrePerimeter;
}
