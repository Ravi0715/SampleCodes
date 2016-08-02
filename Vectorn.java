package ll;

import java.util.Iterator;
import java.util.Vector;

public class Vectorn {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add(0, "ravi");
		v.add(1, "kamal");
		v.add(2, "teja");
		//v.add(0, "teja");
		
		Iterator<String> it = v.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
