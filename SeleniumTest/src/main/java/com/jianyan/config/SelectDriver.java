package com.jianyan.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class SelectDriver {
	WebDriver driver;
	String browserName;
	String serverURL;


	public WebDriver user() {
		Application application = new Application();
		browserName = application.proper("browserName");
		serverURL = application.proper("URL");
		return getBrowser();
	}

	// 初始化浏览器的方法
	public WebDriver getBrowser() {
		if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "SeleniumTest//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "SeleniumTest//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "SeleniumTest//drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(serverURL + "#/layout/");
		driver.manage().window().maximize();
		callwait(5);
		return driver;
	}

	// 退出浏览器的方法
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(3000);
	}

	// 隐式时间等待方法
	public void callwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	// 最大化浏览器
	public void callmaxbrowser() {
		driver.manage().window().maximize();
	}

}
