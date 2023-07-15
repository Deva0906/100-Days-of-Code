import java.util.Scanner;

class Day3
{
	public static void main (String[] args)
{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for (int i=0;i<n;i++)
		{
		  int X = sc.nextInt();
		  if(1<=X && 4>=X)
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
