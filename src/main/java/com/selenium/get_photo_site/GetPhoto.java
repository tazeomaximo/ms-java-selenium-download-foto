package com.selenium.get_photo_site;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetPhoto {
	
	public static void main(String[] args) {
		new GetPhoto().test();
	}
	
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ldarbem/Documents/fotos/chromedriver");

		ChromeOptions options = new ChromeOptions();
				
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
				
		RemoteWebDriver driver = new ChromeDriver(options);
		
//		WebDriver driver = new ChromeDriver();	
//		driver.getWindowHandles().
		
//		driver.SetPreference "download.default_directory", Replace(ThisWorkbook.FullName, ThisWorkbook.name, "")
//		    driver.SetPreference "download.directory_upgrade", True
//		    driver.SetPreference "download.prompt_for_download", False
//		    driver.Get "http://endereco.do.seu.site"

        driver.get("https://mvphoto.fotop.com.br/fotos/eventos?pag=4&evento=103042&tempo=2024-06-08");

        log.info("Titulo: {}",driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
        //driver.findElements(By.cssSelector("span[value=Página]"));
        
        List<WebElement> textBox = driver.findElements(By.cssSelector("div[data-id]"));
        
        textBox.forEach( element -> {
        	log.info( element.getAttribute("data-id"));
        	
        });
        
        log.info("Encontrado {} elementos",textBox.size());
        log.info(textBox.toString());
        
        log.info("fazendo GET");
        driver.get("https://mvphoto.fotop.com.br/fotos/commerceft/download/download-foto-avulsa/a/1286594130");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        // download 
        /*
         * https://mvphoto.fotop.com.br/fotos/commerceft/download/download-foto-avulsa/a/{idFoto}
         */
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();

//        WebElement message = driver.findElement(By.id("message"));
//        message.getText();

        driver.quit();
	}
}
