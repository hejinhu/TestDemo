package com.jianyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		// 设置驱动位置
		System.setProperty("webdriver.chrome.driver", "SeleniumTest//drivers//chromedriver.exe");
		// 实例化谷歌浏览器
		WebDriver driver = new ChromeDriver();
		// 打开主页
		driver.get("http://192.168.10.25:9527/#/layout/");
		String windowHandle = driver.getWindowHandle();
		System.out.println("1 Page title is: " + driver.getTitle());
		// 输入账号密码并登陆
		driver.findElement(By.name("loginName")).sendKeys("dt1");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/form/button/span")).click();
		// 最大化窗口
		driver.manage().window().maximize();


		// 获取“报检受理”页面
		driver.get("http://192.168.10.25:9527/#/zhonghe/shebei");

//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String win : windowHandles) {
//			if (!win.equals(windowHandle)) {
//				driver.switchTo().window(win);
//				break;
//			} else {
//				continue;
//			}
//		}
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"shebei\"]/section/aside/div/div/div[1]/div/div/div[2]/div[6]/div[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"shebei\"]/section/aside/div/div/div[1]/div/div/div[2]/div[6]/div[2]/div[2]/div/div/div/span"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"tab_default\"]/div[1]/div[1]/button[1]/span")).click();

		// 填写报检单信息
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[2]/div[1]/div/div/div/span/span/i"))
				.click();
		driver.findElement(
				By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[2]/div[2]/div/div/div/div[1]/span/span/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[2]/div[3]/div/div/div/div[1]/input"))
				.click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[3]/div[1]/div/div/div/div[1]/input"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[3]/div[2]/div/div/div/div[1]/input"))
				.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/ul/li/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[3]/div[3]/div/div/div/div/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[7]/div/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[2]/div[2]/div[1]/label/span/span"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/span/button[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[4]/div[1]/div/div/div/input"))
				.sendKeys("项目名称");

		// 申报时间
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[4]/div[2]/div/div/div[1]/div/input"))
				.sendKeys("2020-06-06");

		// 申报单位信息
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[7]/div[1]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[7]/div[1]/div/div/div[1]/div/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/form/div[1]/div[1]/div/div/div/input"))
				.sendKeys("湖北汉江新世纪投资有限公司（万科翡翠滨江）");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/form/div[1]/div[5]/button[2]/i")).click();
		Thread.sleep(2000);
		//
		List<WebElement> findElement = driver.findElements(
				By.xpath("//*[@id=\"tab_default\"]/div[2]/div[4]/div[1]/table/thead/tr/th[1]/div/label/span/span"));
		System.out.println(findElement.size());
		for (int i = 0; i < findElement.size(); i++) {
			// 强制等待1秒
			Thread.sleep(1000);
			try {
				findElement.get(i).click();
			} catch (Exception e) {
//				System.out.println(e);
			}
		}
		Thread.sleep(1000);
		
		
		List<WebElement> findElement22 = driver.findElements(
				By.xpath("//*[@id=\"tab_default\"]/div[1]/div/button[1]/span"));
		System.out.println(findElement22.size());
		for (int i = 0; i < findElement22.size(); i++) {
			// 强制等待1秒
			Thread.sleep(1000);
			try {
				findElement22.get(i).click();
			} catch (Exception e) {
//				System.out.println(e);
			}
		}

		// 受检单位信息
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/form/div[13]/div[1]/div/div/div/div/button"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/form/div[1]/div[1]/div/div/div/input"))
				.sendKeys("湖北汉江新世纪投资有限公司（万科翡翠滨江）");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/form/div[1]/div[5]/button[2]/i")).click();
		Thread.sleep(2000);
		//
		List<WebElement> findElement2 = driver.findElements(
				By.xpath("//*[@id=\"tab_default\"]/div[2]/div[4]/div[1]/table/thead/tr/th[1]/div/label/span/span"));
		System.out.println(findElement2.size());
		for (int i = 0; i < findElement2.size(); i++) {
			// 强制等待1秒
			Thread.sleep(1000);
			try {
				findElement2.get(i).click();
			} catch (Exception e) {
//				System.out.println(e);
			}
		}
		
		
		//选择设备
		List<WebElement> findElement33 = driver.findElements(
				By.xpath("//*[@id=\"tab_default\"]/div[1]/div/button[1]/span"));
		System.out.println(findElement33.size());
		for (int i = 0; i < findElement33.size(); i++) {
			// 强制等待1秒
			Thread.sleep(1000);
			try {
				findElement33.get(i).click();
			} catch (Exception e) {
//				System.out.println(e);
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"tab_default\"]/div[1]/div/button/span[text()=\"选择设备\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[9]/div/div[3]/button[2]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#tab_default > div.el-table.el-table--fit.el-table--striped.el-table--border.el-table--scrollable-x.el-table--scrollable-y.el-table--enable-row-transition > div.el-table__fixed > div.el-table__fixed-header-wrapper > table > thead > tr > th.el-table_6_column_54.el-table-column--selection.is-leaf > div > label > span > span")).click();
		
		List<WebElement> findElement44 = driver.findElements(
				By.xpath("//*[@id=\"tab_default\"]/div[1]/div/button/span[text()=\"选择设备\"]"));
		System.out.println(findElement44.size());
		for (int i = 0; i < findElement44.size(); i++) {
			// 强制等待1秒
			Thread.sleep(1000);
			try {
				findElement44.get(i).click();
			} catch (Exception e) {
//				System.out.println(e);
			}
		}
		
		//保存报检
		driver.findElement(By.xpath("//*[@id=\"baojianxinxi\"]/div[1]/div[2]/div/button[2]/span")).click();
		
	}

}
