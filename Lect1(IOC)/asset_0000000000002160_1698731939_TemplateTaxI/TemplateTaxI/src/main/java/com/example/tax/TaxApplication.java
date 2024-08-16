package com.example.tax;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TaxApplication {

	public static void main(String[] args) {
		// Take ClassPathXmlApplicationContext from applicationContext.xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Tax incomeTax = (Tax) context.getBean("incomeTax");
		Tax propertyTax = (Tax) context.getBean("propertyTax");
	}

}
