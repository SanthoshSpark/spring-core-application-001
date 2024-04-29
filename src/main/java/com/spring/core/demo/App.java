package com.spring.core.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = null;
        try {
        	context = new AnnotationConfigApplicationContext(AppConfig.class);
        	HelloService helloService = context.getBean(HelloService.class);
            
            System.out.println(helloService.getGreeting());
            
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        finally {
        	if(context != null) {
        		context.close();
        	}
        }
        
        
        
    }
}
