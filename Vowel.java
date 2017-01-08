package session8;

import java.util.Scanner;
public class Vowel {
	

		public static void main(String [] args)
		{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter txt file name");
	String s=sc.nextLine();

	int count=0;
	String s1=s.toLowerCase();
	for(int i=0;i<s1.length();i++)
	{
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
	count++;
	}
	System.out.println("No. of vowels in the txt file are "+count);
	

	
	sc.close();
	




	

	
	   
	           
	         
	      }
	   }
