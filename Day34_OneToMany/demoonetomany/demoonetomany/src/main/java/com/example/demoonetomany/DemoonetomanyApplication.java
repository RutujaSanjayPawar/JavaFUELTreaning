package com.example.demoonetomany;

//import javax.persistence.ManyToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication
public class DemoonetomanyApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context;
		context=SpringApplication.run(DemoonetomanyApplication.class, args);
		
		CartRepository cart;
		cart=context.getBean(CartRepository.class);
		
		ItemRepository item;
		item=context.getBean(ItemRepository.class);
		
		Cart c1= new Cart(1,"abc");
		cart.save(c1);
		System.out.println("Cart is Saved...!");
		
		Item i1= new Item(100,"mouse",200,c1);
		item.save(i1);
		System.out.println("Item is Saved....!");
		
		
		
		
	}

}
