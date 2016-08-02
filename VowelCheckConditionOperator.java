package org.tasks;


import java.util.Scanner;

class VowelCheckConditionOperator{
	
	public static void main(String args[]){
		
		char ch;
		String vowel="aeiou";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		ch = sc.next().charAt(0);
		String vowelString= "vowel";
		String nonvowelString= "not vowel";
		String st = Character.toString(ch).toLowerCase();
		String temp = vowel.contains(st)?vowelString:nonvowelString;
		System.out.println(ch+" is  "+temp);
	}
}