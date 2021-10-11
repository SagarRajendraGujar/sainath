package tcsnqt;

import java.util.Scanner;

public class Sep12_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int k=0;k<size;k++) {
			arr[k]=sc.nextInt();
		}

		int count = 0;
		for (int j = 0; j < size; j++) {
			if (arr[j] != 0)
				System.out.print(arr[j]);
			else
				count++;
		}

		for (int i = 0; i < count; i++) {
			System.out.print(0);
		}

	}

}
