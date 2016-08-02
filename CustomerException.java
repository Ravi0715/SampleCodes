package org.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.pojos.CustomerPojo;
import org.userdefinedexceptions.NotEnoughBalanceException;

public class CustomerException {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("D:\\employee\\customer.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		Hashtable<Long, CustomerPojo> ht = new Hashtable<Long, CustomerPojo>();
		while((line=br.readLine())!=null)
		{
			String arr[] = line.split(",");
			CustomerPojo customerPojo = new CustomerPojo();
			customerPojo.setAccNo(Long.parseLong(arr[0]));
			customerPojo.setcId(arr[1]);
			customerPojo.setcName(arr[2]);
			customerPojo.setcAmt(Integer.parseInt(arr[3]));
			ht.put(customerPojo.getAccNo(), customerPojo);
		}
		Set<Entry<Long, CustomerPojo>> selc = ht.entrySet();
		Iterator<Entry<Long, CustomerPojo>> ielc = selc.iterator();
		while(ielc.hasNext())
		{
			Entry<Long, CustomerPojo> elc = ielc.next();
			CustomerPojo cp =elc.getValue();
			if(cp.getcAmt()<1000)
			{
				throw new NotEnoughBalanceException("Balance is too low in your account: "+elc.getKey());
			}
		}
	}

}
