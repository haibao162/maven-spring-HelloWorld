/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package annotation.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import annotation.TestObject;


@Repository(value="haibao162")
public class UserRepositoryImpl implements UserRepository{

	/* (non-Javadoc)
	 * @see annotation.Repository.UserRepository#save()
	 */
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepositoryImpl Save...");
		System.out.println(to);
	}
	
@Autowired(required=false)
private TestObject to;
}
