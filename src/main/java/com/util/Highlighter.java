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

package com.util;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	
	public static void getColor (WebDriver driver, WebElement element) {
		
		Random r = new Random();
		int rand = r.nextInt(5)+1;
		System.out.println("Color Code Number: "+rand);
		if(rand == 1)
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid red'", element);
		else if(rand == 2)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid green'", element);
		else if(rand == 3)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid blue'", element);
		else if(rand == 4)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid yellow'", element);
		else if(rand == 5)
			((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid purple'", element);
		else
			System.out.println("No color selected "+rand+ " Number genarated");
	}
}