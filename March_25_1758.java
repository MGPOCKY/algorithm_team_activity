package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_25_1758 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long result = 0;
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i] = scan.nextInt();
			arr[i] += 1;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(N > arr[i])
			{
				arr[i] = 0;
				N--;
			}
			else
				result += arr[i];
		}
		
		for(int i=1;i<=N;i++)
		{
			result -= i;
		}
		System.out.println(result);
	}

}
