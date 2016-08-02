package org.student;

//import java.util.Scanner;

public class Marks {

	int sInternalMarks,sExternalMarks,sCredits;
	
	/*public void read()
	{
		Scanner r = new Scanner(System.in);
		int s=r.nextInt();
		
	}*/

	public int getsInternalMarks() {
		return sInternalMarks;
	}

	public void setsInternalMarks(int sInternalMarks) {
		this.sInternalMarks = sInternalMarks;
	}

	public int getsExternalMarks() {
		return sExternalMarks;
	}

	public void setsExternalMarks(int sExternalMarks) {
		this.sExternalMarks = sExternalMarks;
	}

	public int getsCredits() {
		return sCredits;
	}

	public void setsCredits(int sCredits) {
		this.sCredits = sCredits;
	}
	
}
