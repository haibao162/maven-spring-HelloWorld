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
public class HelloWorld {
    private String name;
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}
