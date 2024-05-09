package com.example.onlineShop;

import com.example.onlineShop.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication implements Runnable{

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

	@Override
	public void run() {

		userService us =new userService();
		System.out.println(us.login("test","1234567"));
	}
}
