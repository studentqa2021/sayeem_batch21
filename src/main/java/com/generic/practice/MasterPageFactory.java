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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath = "//*[@ = '']");
	private WebElement signout;
	@FindBy(xpath = "//*[@name = 'userName']")
	private WebElement user;
	@FindBy(xpath = "//*[@name = 'password']")
	private WebElement password;
	@FindBy(xpath = "//*[@name = 'submit']")
	private WebElement submit;

}
