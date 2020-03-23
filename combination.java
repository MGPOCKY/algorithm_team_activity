package First_week;

import java.util.Scanner;

public class combination {
	static int count = 0;

	public static boolean isValid(int arr[], int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				return false;
		}
		return true;
	}

	public static void comb(int start, int end, int arr[]) {
		if(start == end) {
			count++;
//			for(int i=0;i<end;i++)
//			{
//				System.out.print(arr[i]+" ");
//			}
//			System.out.println();

		}
		for (int i = 1; i <= end; i++) {
			if(isValid(arr, i))
			{
				arr[start] = i;
				comb(start + 1, end, arr);
				arr[start] = 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
//		int num = scan.nextInt();
//		if (num == 1) {
//
//		} else if (num == 2) {
//
//		}
		int arr[] = new int[N];
		comb(0, N, arr);
		System.out.println(count);
	}

}
