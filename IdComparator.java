package org.comparator;

import java.util.Comparator;

import org.pojos.Employee;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.geteId()==o2.geteId())
			return 1;
		return 0;
	}

}
