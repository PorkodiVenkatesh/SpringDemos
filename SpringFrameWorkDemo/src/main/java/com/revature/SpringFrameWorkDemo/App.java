package com.revature.SpringFrameWorkDemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	
//    	Car c = new Car();
//    	c.drive();
//    	
//    	Bike b = new Bike();
//    	b.drive();
    	
    	//Object are called as beans
    	//Spring IOC container takes care of it
    	//Using BeanFactory (XML) or Application Content (XML+ Java based Configuration)
    	//Bean Factory -> beans -> objects
    	
//    	BeanFactory beanFactory  = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//    	
//	   	Vehicle obj = (Vehicle) beanFactory.getBean("porkodi");
//	   	obj.drive();
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
//    	Vehicle obj  = (Vehicle) context.getBean("porkodi");
//    	obj.drive();
    	
//    	Tyre t = new Tyre("Ceat");
//    	System.out.println(t);
        
    	//using setter injection
    	Tyre t1 =  (Tyre) context.getBean("sample1");
    	System.out.println(t1);
    	
    	//using constructor injection
    	Tyre t2 =  (Tyre) context.getBean("sample2");
    	System.out.println(t2);
       
       
        
    }
}
