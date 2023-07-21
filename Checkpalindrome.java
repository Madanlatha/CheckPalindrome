package palindrome;

import java.util.Scanner;

public class Checkpalindrome {
	int ispalindrome(String str,int start,int end) {
		if(start<end) {
			return 1;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return 0;
		}
		return ispalindrome(str,start+1,end-1);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Checkpalindrome palin=new Checkpalindrome();
		System.out.println(palin.ispalindrome(str,0,str.length()-1));
		
		

	}

}
