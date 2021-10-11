package tcsnqt;

import java.util.Scanner;

public class Sep12_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++)// for row
		{
			for (int j = 0; j < cols; j++)// for column
			{
				arr[i][j] = sc.nextInt();
			}
		}
         
		int tempcount = 0;
		int count = 0;
		int rowno = 0;
		for (int i = 0; i < rows; i++)// for row
		{
             tempcount=0;
			for (int j = 0; j < cols; j++)// for column
			{

				System.out.print(arr[i][j] + " ");
				if (arr[i][j] == 1)
					tempcount++;
			}
			if (tempcount > count) {
				count = tempcount;
				rowno = i+1;
			}
             System.out.println();
		}
		System.out.println("most slots are feeld in row no: "+ rowno);

	}

}
