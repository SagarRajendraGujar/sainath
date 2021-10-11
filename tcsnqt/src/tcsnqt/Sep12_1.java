package tcsnqt;

import java.util.Scanner;

public class Sep12_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int star=0;
		int hatch=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='*')
			{
				star++;
			}
			else if(s.charAt(i)=='#')
			{
				hatch++;
			}
				
		}
		System.out.println(star-hatch);
	}

}
