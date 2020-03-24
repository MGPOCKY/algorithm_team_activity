package First_week;

import java.util.Scanner;

public class March_25_1816 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int j;
		for(int i=0;i<N;i++)
		{
			long input = scan.nextLong();
			for(j=2;j<=1000000;j++)
			{
				if (input % j == 0)
					break;
			}
			if (j != 1000001)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
