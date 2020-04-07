package Stack;

import java.util.Scanner;
import java.util.Stack;

public class April_6_3986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int count = 0;
		scan.nextLine();

		for (int i = 0; i < N; i++) {
			Stack<Integer> stack = new Stack<>();
			String line = scan.nextLine();
			for (int j = 0; j < line.length(); j++) {
				if (!stack.isEmpty()) {
					if (stack.peek() == line.charAt(j))
						stack.pop();
					else {
						stack.push((int) line.charAt(j));
					}
				} else {
					stack.push((int) line.charAt(j));
				}
			}
			if (stack.size() == 0)
				count++;
		}
		System.out.println(count);
	}

}
