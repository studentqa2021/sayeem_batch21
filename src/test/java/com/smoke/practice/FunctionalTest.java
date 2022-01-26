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

import java.util.Scanner;

import com.generic.practice.Animal;

/**
 * @author SAM
 *
 */
public class FunctionalTest {

	/**
	 * 
	 */
	public FunctionalTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String txt = "United States of America";
			char ch ;
			System.out.print("Enter A Character from \""+txt+"\" : ");
			ch = sc.next().charAt(0);
			Animal obj = new Animal();
			obj.reverseGetText(txt);
			System.out.println();
			obj.countchar(txt,ch);
		}
		
		
		/*int i = name.length()-1;
		do
		{
			System.out.println(name.charAt(i));
			i--;
		}while(i >= 0);*/
	}

}
