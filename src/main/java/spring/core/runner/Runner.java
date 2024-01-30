package spring.core.runner;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.core.model.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.core.model.Employee;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e1 =  (Employee)IOC.getBean("vishal");
		Employee e2 =  IOC.getBean(Employee.class,"vishal");
		
		System.out.println(e1);
		System.out.println(e2);
	}
}

