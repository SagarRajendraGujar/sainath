package tcsnqt;

import java.util.Scanner;

public class Sep13_2 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int size=sc.nextInt();
	   int arr[]=new int[size];
	   for(int i=0;i<size;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   
	   int count=0;
	  for(int i=0;i<size;i++)
	  {	  
		  for(int j=i+1;j<size;j++)
		  {
			  if(arr[i]==0 && arr[j]==1)
			  {
				 count++; 
			  }
		  }
	  }
	  System.out.println(count);
	}

}
