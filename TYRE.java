import java.util.Scanner;

class Day7
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0;i<T;i++)
{
		int N = sc.nextInt();
		int M = sc.nextInt();
 System.out.println(N*2+M*4);
		}
	}
}