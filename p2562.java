package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2562 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i=0;i<9;i++)
		{
			int input = Integer.parseInt(br.readLine());
			if(max < input)
			{
				max = input;
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
