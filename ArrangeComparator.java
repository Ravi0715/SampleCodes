package practice.tasks;

import java.util.Comparator;

public class ArrangeComparator implements Comparator<StringCk>{

	@Override
	public int compare(StringCk o1, StringCk o2) {
		
			if(o1.getAsciiCount()<o2.getAsciiCount())
					return 1;	
			else if(o1.getAsciiCount()>o2.getAsciiCount())
					return -1;
			else
			{
				if(o1.getCharCount()<o2.getCharCount())
					return 1;
				else if(o1.getCharCount()>o2.getCharCount())
					return -1;
				else
					return 0;
			}
	}

}
