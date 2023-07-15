import java.util.Scanner;

class Day6
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int N=sc.nextInt();
			int M=sc.nextInt();
			int K=sc.nextInt();
			if(N<=M*K)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
