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

public class ArrayPractice {

	public static void main(String[] args) {
		int a[] = {14,24,34,34,44,54,14};
		int count = 0;
		for(int i = 0; i <a.length; i++)
		{
			for(int j = (i+1); j < a.length; j++)
			{
				System.out.println(a[i]+"<<<<<>>>>>"+a[j]);
				if(a[i] == a[j])
				{
					System.err.println("Duplicate Value: "+a[i]);
					count++;
				}
			}
		}
		System.out.println("--------------------------");
		System.out.println("Total Duplicate: "+count);
	}

}
