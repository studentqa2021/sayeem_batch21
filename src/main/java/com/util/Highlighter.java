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

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	
	public static void getColor (WebDriver driver, WebElement element,String color) {
		Map<String,String> mp = new HashMap<>();
		mp.put("RED", "arguments[0].style.border='5px solid red'");
		mp.put("BLUE", "arguments[0].style.border='5px solid blue'");
		mp.put("GREEN", "arguments[0].style.border='5px solid green'");
		mp.put("YELLOW", "arguments[0].style.border='5px solid yellow'");
		mp.put("PURPLE", "arguments[0].style.border='5px solid purple'");
		
		
		((JavascriptExecutor)driver).executeScript(mp.get(color), element);
		
			
	}
}