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
 * 实例工厂方法：实例工厂的方法，即现需要创建工厂本身，再调用工厂的实例方法来返回bean的实例
 * 
 */
public class InstanceCarFactory {
private Map<String,Car> cars=null;
public InstanceCarFactory(){
	
	cars=new HashMap<String,Car>();
    cars.put("toyota", new Car("toyota",300000));
    cars.put("haibao162", new Car("haibao164",1000000));
    
}

public Car getCar(String brand){
	return cars.get(brand);
}
}
