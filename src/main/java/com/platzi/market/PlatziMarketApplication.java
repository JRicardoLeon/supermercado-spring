package com.platzi.market;

import com.platzi.market.persistence.ProductoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PlatziMarketApplication {

	public static void main(String[] args) {


		try {
			SpringApplication.run(PlatziMarketApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
