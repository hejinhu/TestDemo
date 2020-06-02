package com.jianyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jianyan.config.SelectDriver;

public class Test {


	public static void main(String[] args) {
		WebDriver driver;
		SelectDriver config = new SelectDriver();
		driver=config.user();
		driver.findElement(By.name("loginName")).sendKeys("dt1");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/button/span")).click();
	}
}
