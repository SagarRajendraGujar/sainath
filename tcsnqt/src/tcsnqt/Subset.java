package tcsnqt;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int[] arr= new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int num2=sc.nextInt();
		int s=sc.nextInt();
		boolean found=false;

		for(int i=0;i<num;i+=s)
		{
			found=false;
			for(int j=i;j<i+s && j<num;j++)
				if(arr[j]==num2)
				{
					found=true;
				}
			
			        
			  
			if(found)
			        	continue;
			        else
			        	System.out.println(0);
			            System.exit(0);
		}
		System.out.println(1);

	}

}
