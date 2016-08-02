package org.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ListSampleCheck {

	public static void main(String[] args) {
		
			List<Integer>  li = new ArrayList<Integer>();
			li.add(503);li.add(552);
			li.add(566);li.add(571);
			System.out.println(li);
			//li.removeAll(li);
			//li.clear();
			Collections.reverse(li);
			//Collections.swap(li, 0, 3);
			
			System.out.println(li);

	}

}
