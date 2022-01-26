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

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumFirefox {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://twitter.com/");
		driver.findElement(By.linkText("Sign up with phone or email")).click();
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("SAM");
		driver.findElement(By.name("phone_number")).sendKeys("09999999999");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next']")).click();

	}

}
