package com.raven.springbootdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdiApplication.class, args);
		System.out.println("\nApplication started...");

		System.out.println("\n*** Beans ****");
		System.out.println("\nNo of Beans :: " + context.getBeanDefinitionCount());
		System.out.println("\nBean names ::");
		int count = 0;
		for (String s : context.getBeanDefinitionNames()) {
			System.out.println("Name #" + (count + 1) + " : " + s);
			count++;
		}
		System.out.println();

		// GET BEAN FROM SPRING CONTAINER
		ICar astonMartin = context.getBean(AstonMartin.class);

		// CALL A METHOD ON THE BEAN
		System.out.println(astonMartin.getCarDetails());

		// CALL METHOD TO GET ENGINE DETAILS
		System.out.println(astonMartin.getEngine());
	}

}
