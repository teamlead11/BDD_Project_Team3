package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		WebElement table = driver.findElement(By.xpath(""));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		for (WebElement rows : tRows) {
			List<WebElement> tData = rows.findElements(By.tagName("td"));
			for (WebElement data : tData) {
				System.out.println(data.getText());
				
			}
			
		}
	}

}
