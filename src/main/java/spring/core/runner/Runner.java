package spring.core.runner;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.core.model.Employee;

class Runner {

	public static void main(String[] args) {
		ApplicationContext IOC = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee e1 =  (Employee)IOC.getBean("Kunal");
//		Employee e2 =  IOC.getBean(Employee.class,"Kunal");
		
		
		System.out.println(e1);
//		System.out.println(e2);
	}

	}

