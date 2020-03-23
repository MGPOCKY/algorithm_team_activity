package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_23_1920 {
	
	public static int bin_search(int arr[], int search)
	{
		int start = 0;
		int end = arr.length;
		int middle = (start + end) / 2;
		while (start != middle && end != middle)
		{
			if (arr[middle] > search)
			{
				end = middle;
				middle = (start + end) / 2;
			}
			else if(arr[middle] <= search)
			{
				start = middle;
				middle = (start + end) / 2;
			}
		}
		//System.out.println(arr[middle]);
		if(arr[middle] == search)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int M = scan.nextInt();
		for(int i=0;i<M;i++)
		{
			int search = scan.nextInt();
			System.out.println(bin_search(arr, search));
		}
	}

}
