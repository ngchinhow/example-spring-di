package com.example.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDIApplication implements CommandLineRunner {
	public CarMarket carMarket;
	public ApplicationContext applicationContext;

	@Autowired
	public SpringDIApplication(CarMarket carMarket, ApplicationContext applicationContext) {
		this.carMarket = carMarket;
		this.applicationContext = applicationContext;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDIApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Car car = new Car("Toyota");
		Buyer buyer = new Buyer(car, 20000);

		Integer price = carMarket.searchMarket(buyer);
		if (price == null) {
			System.out.println("CANNOT AFFORD");
		} else {
			System.out.println(price);
		}

		String[] beanNames = applicationContext.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}
