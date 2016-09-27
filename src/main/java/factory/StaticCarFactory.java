/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author predix -
 */
public class StaticCarFactory {
	private static Map<String,Car> cars=new HashMap<String,Car>();
	static{
		cars.put("toyota",new Car("toyota",300000) );
	    cars.put("ford", new Car("ford",400000));
	    cars.put("haibao162", new Car("haibao164",500000));
	}
public static Car getCar(String name){
	return cars.get(name);
}
}
