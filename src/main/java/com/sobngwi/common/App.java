package com.sobngwi.common;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	static final Logger log = Logger.getLogger(com.sobngwi.common.App.class);
	
	public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
       log.info(context.getBean("helloBean"));
       
        
    }
}
