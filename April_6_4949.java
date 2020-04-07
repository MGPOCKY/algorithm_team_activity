package Stack;

import java.util.Scanner;
import java.util.Stack;

public class April_6_4949 {
	
	public static boolean check(int a, int b)
	{
		if(a == 40 && b == 41)
			return true;
		else if(a == 91 && b == 93)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String line = null;
		
		while(true)
		{
			line = scan.nextLine();
			if(line.equals("."))
				break;
			else
			{
				Stack<Integer> stack = new Stack<>();
				for(int j=0;j<line.length();j++)
				{
					if(line.charAt(j) == '(' || line.charAt(j) == '[')
						stack.push((int)line.charAt(j));
					else if(line.charAt(j) == ')' || line.charAt(j) == ']')
					{
						if(stack.size() == 0 || !check(stack.peek(), (int)line.charAt(j)))
						{
							System.out.println("no");
							break;
						}
						else if(check(stack.peek(), (int)line.charAt(j)))
							stack.pop();
					}
					if(j == line.length() - 1 && stack.size() != 0)
						System.out.println("no");
					else if(j == line.length() - 1 && stack.size() == 0)
						System.out.println("yes");
				}
				
			}
		}
	}

}
