package Stack;

import java.util.Scanner;
import java.util.Stack;

public class April_6_10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int sum = 0;
		for(int i=0;i<K;i++)
		{
			int input = scan.nextInt();
			if(input != 0)
				stack.push(input);
			else
				stack.pop();
		}
		while(stack.size() > 0)
		{
			sum += stack.pop();
		}
		System.out.println(sum);
	}

}
