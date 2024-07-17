package com.selenium.get_photo_site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetPhotoSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetPhotoSiteApplication.class, args);
		new GetPhoto().test();
	}

}
