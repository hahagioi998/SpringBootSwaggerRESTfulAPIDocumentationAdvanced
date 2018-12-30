package com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance;

import com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.model.Product;
import com.izdebski.SpringBootRESTfulAPIDocWithSwaggerAdvance.repository.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootResTfulApiDocWithSwaggerAdvanceApplication implements ApplicationListener<ContextRefreshedEvent> {

	private Logger log = Logger.getLogger(SpringBootResTfulApiDocWithSwaggerAdvanceApplication.class);
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootResTfulApiDocWithSwaggerAdvanceApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		loadProducts();
	}

	private void loadProducts() {
		Product samsungGalaxy = new Product();
		samsungGalaxy.setDescription("Samsung Galaxy J7 SM-J700F");
		samsungGalaxy.setPrice(new BigDecimal("13299.00"));
		samsungGalaxy.setImageUrl("https://www.amazon.in/Samsung-Galaxy-J7-SM-J700F-Gold/dp/B014DYVWWS?tag=googinhydr18418-21&tag=googinkenshoo-21&ascsubtag=115b9bbe-7ef0-4c67-825a-60b83fba9303");
		samsungGalaxy.setProductId("23526889931068308");
		productRepository.save(samsungGalaxy);

		log.info("Saved Phone - id: " + samsungGalaxy.getId());

		Product iPhone = new Product();
		iPhone.setDescription("Apple iPhone 7");
		iPhone.setImageUrl("https://www.flipkart.com/apple-iphone-7-rose-gold-32-gb/p/itmen6dapsvxanrk?gclid=Cj0KCQjwgIPOBRDnARIsAHA1X3Rm2-sqRfpmiyWQn3B246U8_MYk0eTO3UgZ0TiR2y1Wh-IqJMZ5EBIaAgIUEALw_wcB&pid=MOBEMK62JSRHU85T&lid=LSTMOBEMK62JSRHU85TIU9DKW&cmpid=content_mobile_8965229628_gmc_pla&tgi=sem%2C1%2CG%2C11214002%2Cg%2Csearch%2C%2C50314728260%2C1o1%2C%2C%2Cc%2C%2C%2C%2C%2C%2C%2C&s_kwcid=AL%21739%213%2150314728260%21%21%21%21356518884166%21&ef_id=Wb0-8gAABBk1ZGmB%3A20170920024538%3As");
		iPhone.setProductId("198639393495300006");
		iPhone.setPrice(new BigDecimal("47499"));
		productRepository.save(iPhone);

		log.info("Saved Phone - id:" + iPhone.getId());
	}
}