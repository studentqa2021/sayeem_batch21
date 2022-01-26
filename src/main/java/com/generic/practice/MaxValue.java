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

public class MaxValue {

	public static void main(String[] args) {
		int[] number = {45,67,98,100,201};
		maxValue(number,number[0]);
		
	}

	private static void maxValue(int[] number, int max) 
	{
		int secondmax = 0;
		for(int i = 0; i < number.length; i++)
		{
			//System.out.println(number[i]);
			
			if(number[i] > max)
			{
				secondmax = max;
				max = number[i];
			}
		}
		System.out.println("Max Value: "+max+"\n2nd Max Value: "+secondmax);	
		
	}

}
