package com.sks;

public class Helloworld {
	 
    // This method executes
    // automatically as the bean
    // is instantiated
    public void init() throws Exception
    {
        System.out.println(
            "HelloWorld has been "
            + "instantiated and I'm "
            + "the init() method");
    }
 
    // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
            "Container has been closed "
            + "and I'm the destroy() method");
    }
}