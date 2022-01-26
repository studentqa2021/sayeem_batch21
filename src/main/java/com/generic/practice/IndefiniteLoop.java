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

import java.util.ArrayList;
import java.util.List;

public class IndefiniteLoop {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i = 0; ;i++)
		{
			myList.add(i);
			System.out.println(myList.get(i));
			if(myList.size()>=500)
			{
				break;
			}
		}
	}

}
