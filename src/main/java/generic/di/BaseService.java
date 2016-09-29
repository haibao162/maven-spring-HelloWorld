/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author predix -
 */
public class BaseService<T> {
	
@Autowired
protected BaseRepository<T> repository;
public void add(){
	System.out.println("add...");
	System.out.println(repository);
}
}
