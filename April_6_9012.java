package Stack;

import java.util.Scanner;
import java.util.Stack;

public class April_6_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < T; i++) {
			Stack<String> stack = new Stack<>();
			String line = scan.nextLine();
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) == '(')
					stack.push("(");
				else if (line.charAt(j) == ')') {
					if (!stack.isEmpty())
						stack.pop();
					else {
						System.out.println("NO");
						break;
					}
				}
				if (j == line.length() - 1) {
					if (stack.size() != 0)
						System.out.println("NO");
					else
						System.out.println("YES");
				}
			}
		}
	}

}
