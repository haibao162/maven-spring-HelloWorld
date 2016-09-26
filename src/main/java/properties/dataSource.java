/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package properties;

/**
 * 
 * @author predix -
 */
public class dataSource {
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "dataSource [user=" + user + ", password=" + password
				+ ", driverClass=" + driverClass + ", jdbcUrl=" + jdbcUrl
				+ ", getUser()=" + getUser() + ", getPassword()="
				+ getPassword() + ", getDriverClass()=" + getDriverClass()
				+ ", getJdbcUrl()=" + getJdbcUrl() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
/**
	 * @return the user
	 */
	public String getUser() {
		return this.user;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}
	/**
	 * @return the driverClass
	 */
	public String getDriverClass() {
		return this.driverClass;
	}
	/**
	 * @return the jdbcUrl
	 */
	public String getJdbcUrl() {
		return this.jdbcUrl;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param driverClass the driverClass to set
	 */
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	/**
	 * @param jdbcUrl the jdbcUrl to set
	 */
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
private String user;
private String password;
private String driverClass;
private String jdbcUrl;
}
