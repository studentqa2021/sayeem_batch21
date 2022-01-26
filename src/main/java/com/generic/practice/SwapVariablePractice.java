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
package com.generic.practice;

public class SwapVariablePractice {
	
	public void getSwap(int a, int b)
	{	
		System.out.println("Before Swapping A Value: "+a);
		System.out.println("Before Swapping b Value: "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping A Value: "+a);
		System.out.println("After Swapping A Value: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapVariablePractice obj = new SwapVariablePractice();
		obj.getSwap(2,6);
	}

}
