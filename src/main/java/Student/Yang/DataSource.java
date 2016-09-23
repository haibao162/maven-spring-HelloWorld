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

import java.util.Properties;

/**
 * 
 * @author predix -
 */
public class DataSource {
private Properties properties;

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "DataSource [properties=" + properties + "]";
}

/**
 * @return the properties
 */
public Properties getProperties() {
	return this.properties;
}

/**
 * @param properties the properties to set
 */
public void setProperties(Properties properties) {
	this.properties = properties;
}
}
