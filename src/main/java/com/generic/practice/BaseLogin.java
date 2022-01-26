/*
 * Copyright (c) 2022 SAM
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

package com.generic.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	public void baselogin() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://automationpractice.com/index.php");
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

		WebElement loginOut = driver.findElement(By.xpath("//*[@class = 'logout']"));
        loginOut.click();
                
        Thread.sleep(10000);
		
		driver.close();
		driver.quit();
	}

}
