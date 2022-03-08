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

package com.smoke.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice
{

	public static void main(String[] args) 
	{
		 	ArrayList<String> tempCity = new ArrayList<>();
	        Map<String,ArrayList<String>> mapCity = new HashMap<String, ArrayList<String>>();
	        Map<String,ArrayList<String>> mapState = new HashMap<String, ArrayList<String>>();
	        mapState.put("New Jersey", new ArrayList<>());
	        mapState.get("New Jersey").add("Trenton");
	        mapState.get("New Jersey").add("Hoboken");
	        mapState.get("New Jersey").add("Jersey City");
	        mapState.get("New Jersey").add("Clifton");
	        mapState.put("New York", new ArrayList<>());
	        mapState.get("New York").add("Albany");
	        mapState.get("New York").add("New York City");
	        mapState.get("New York").add("Long Island");
	        mapState.get("New York").add("Buffalo");
	        
	        mapState.forEach((key,value) ->
	        {
	            if(key.equals("New York"))
	            {
	                System.out.println(key+" ===> "+value.get(1));
	                tempCity.addAll(mapState.get(key));
	            }
	        });
	        System.out.println("++++++++++++++++++++");
	       /* for (String key : mapState.keySet()) 
	        {
	           for(String s : mapState.get(key))
	           {
	               if(key.equals("New York"))
	               {
	                   tempCity.add(s);
	               }
	           }
	        }
	        */
	        mapCity.put(tempCity.get(1), new ArrayList<>());
	        mapCity.get(tempCity.get(1)).add("Manhattan");
	        mapCity.get(tempCity.get(1)).add("Brooklyn");
	        mapCity.get(tempCity.get(1)).add("Bronx");
	        mapCity.get(tempCity.get(1)).add("Queens");
	        mapCity.get(tempCity.get(1)).add("Staten Islan");
	        
	        mapCity.forEach((key, value) ->
	        {
	            System.out.println(key+" ===> "+value);
	        });
	    }
	 
	}
