package First_week;

import java.util.Arrays;
import java.util.Scanner;

class word implements Comparable<word>{
	String word;

	public word(String word)
	{
		this.word = word;
	}
	@Override
	public int compareTo(word comp) {
		if(comp.word.length() > this.word.length())
			return -1;
		else if(comp.word.length() < this.word.length())
			return 1;
		else if (comp.word.compareTo(this.word) > 0)
			return -1;
		else if (comp.word.compareTo(this.word) < 0)
			return 1;
		else
			return 0;
	}
}

public class March_27_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		word arr[] = new word[N];
		scan.nextLine();
		for(int i=0;i<N;i++)
		{
			String line = scan.nextLine();
			arr[i] = new word(line);
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			if (i!=N-1 && !(arr[i].word.equals(arr[i+1].word)))
				System.out.println(arr[i].word);
			else if(i == N-1)
				System.out.println(arr[i].word);
		}
	}

}
