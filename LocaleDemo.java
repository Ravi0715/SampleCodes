package org.kartheek;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		
		Locale locale[] = SimpleDateFormat.getAvailableLocales();

		for(int i=0;i<locale.length;i++){
			System.out.println(locale[i].getCountry()+" "+locale[i].getDisplayName()+" "+locale[i].getLanguage());
		}
	}

}
