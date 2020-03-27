package First_week;

import java.util.Arrays;
import java.util.Scanner;

public class March_27_11651 {
	
	static class Point implements Comparable<Point> {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point comp) {
			if (comp.y > this.y)
				return -1;
			else if (comp.y < this.y)
				return 1;
			else if (comp.x > this.x)
				return -1;
			else if (comp.x < this.x)
				return 1;
			else
				return 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		Point arr[] = new Point[N];
		for(int i=0;i<N;i++)
		{
			int x = scan.nextInt();
			int y=scan.nextInt();
			arr[i] = new Point(x, y);
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			System.out.println(arr[i].x + " "+arr[i].y);
		}
		
	}

}
