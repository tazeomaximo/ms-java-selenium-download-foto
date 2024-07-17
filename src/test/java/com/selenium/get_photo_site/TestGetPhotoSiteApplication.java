package com.selenium.get_photo_site;

import org.springframework.boot.SpringApplication;

public class TestGetPhotoSiteApplication {

	public static void main(String[] args) {
		SpringApplication.from(GetPhotoSiteApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
