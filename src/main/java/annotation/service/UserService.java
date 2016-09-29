/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import annotation.Repository.UserRepository;


@Service
public class UserService {

	
	private UserRepository userRepository;
    // 使用setter方法注入
	@Autowired	
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
public void add(){
	System.out.println("UserService add...");
	userRepository.save();
	haibao162.save();
    userRepositoryQualifier.save();
}
//public void haibao162(){
//	System.out.println("haibao162 ...");
//}
@Autowired
private UserRepository haibao162;

@Autowired
@Qualifier("userRepositoryQualifier")
private UserRepository userRepositoryQualifier;

/*private UserRepository userRepositoryQualifier;
@Autowired
public void setUserRepository(@Qualifier("userRepositoryQualifier")UserRepository userRepository){
this.repository=repository;
}
*/
}
