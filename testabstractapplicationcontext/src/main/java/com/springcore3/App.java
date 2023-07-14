package com.springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
     System.out.println( "Hello World!" );
     AbstractApplicationContext context=new ClassPathXmlApplicationContext("abstractAC.xml");
     TestAbstractApplicationContext testAbstractApplicationContext=(TestAbstractApplicationContext)context.getBean("testAbstractAC");
           context.registerShutdownHook();                
     System.out.println(testAbstractApplicationContext);
    }
}
