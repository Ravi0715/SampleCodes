package org.comparators;

import java.util.Comparator;

import org.pojos.SortModelClass;

public class SortComparator implements Comparator<SortModelClass> {

	@Override
	public int compare(SortModelClass o1, SortModelClass o2) {
		if(o1.getValue()>o2.getValue())
			return 1;
		else if(o1.getValue()<o2.getValue())
			return -1;
		else
		{
			if(o1.getKey()>o2.getValue())
				return 1;
			else 
				return 0;
		}
	}

	

}
