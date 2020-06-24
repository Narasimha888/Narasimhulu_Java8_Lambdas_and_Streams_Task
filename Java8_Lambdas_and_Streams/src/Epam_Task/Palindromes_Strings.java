package Epam_Task;
import java.util.*;
import java.util.stream.IntStream;
public class Palindromes_Strings {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter no.of strings : ");
	int n=scan.nextInt();
	String s[]=new String[n];
	for(int i=0;i<n;i++) {
		s[i]=scan.next();
		boolean c=isPalindrome(s[i]);
		if(c==true) {
			System.out.println(s[i]+" is polindrome.");
		}
		else
			System.out.println(s[i]+" is not a Polindrome. ");
	}
}
static boolean isPalindrome(String s) {
	String temp=s.replaceAll("\\s+","").toLowerCase();
	boolean t=IntStream.range(0,temp.length()/2).noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1));
	return t;
}
}
