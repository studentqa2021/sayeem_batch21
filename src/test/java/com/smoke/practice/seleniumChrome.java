/*
 * Copyright (C) 2022 SAM
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; version 2
 * of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.smoke.practice;

/**
 *
 * @author SAM
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://twitter.com/");
		driver.findElement(By.linkText("Sign up with phone or email")).click();
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("SAM");
		driver.findElement(By.name("phone_number")).sendKeys("09999999999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next']")).click();*/
		
		//---------------- Facebook Login-----------------------
				//driver.get("https://facebook.com/");
				//driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("$$$$$@gmail.com");
				//driver.findElement(By.xpath("//*[@name = 'pass']")).sendKeys("************");
				//driver.findElement(By.xpath("//*[@name = 'login']")).click();
	    //----------------Facebook Login------------------------
		
		/*driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signInButton = driver.findElement(By.xpath("//*[@class = 'login']"));
		signInButton.click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//*[@id = 'email']"));
		email.sendKeys("sarowerny@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@name = 'passwd']"));
		password.sendKeys("student");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id = 'SubmitLogin']"));
		loginButton.click();
		
		Thread.sleep(20000);
		
		WebElement logOut = driver.findElement(By.xpath("//*[@class = 'logout']"));
		logOut.click();
		
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();*/
		
		//---------------- guru99 Login-----------------------
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name = 'userName']")).sendKeys("smarttech");
		driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys("student");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
//----------------guru99 Login------------------------
		
	}

}