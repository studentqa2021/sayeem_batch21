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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.practice.MasterPageFactory;
import com.util.BaseConfig;
import com.util.Highlighter;

/**
 * @author SAM
 *
 */
public class Smoke_Test {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		//BaseLogin obj = new BaseLogin();
		//obj.baselogin();
		MasterPageFactory MPF = new MasterPageFactory(driver);
		BaseConfig BC = new BaseConfig();
		driver.get("https://demo.guru99.com/test/newtours/");
		//you can pass 5 colors ("RED","BLUE","GREEN","YELLOW","PURPLE") in getColor as a 3rd Argument
		Highlighter.getColor(driver, MPF.getUser(),"RED");
		Thread.sleep(3000);
		Highlighter.getColor(driver, MPF.getPassword(),"GREEN");
		MPF.getUser().sendKeys(BC.getValue("user"));
		MPF.getPassword().sendKeys(BC.getValue("password"));
		Thread.sleep(2000);
		Highlighter.getColor(driver, MPF.getSubmit(),"PURPLE");
		//MPF.getSubmit().click();
		
	}


}
