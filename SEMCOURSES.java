import java.util.Scanner;

class Day1
{
	public static void main (String[] args) throws java.lang.Exception

	{
	  Scanner sc=new Scanner (System.in);
	  int n=sc.nextInt();
	  while(n-->0){
	      int x=sc.nextInt();
	      int y=sc.nextInt();
	      int z=sc.nextInt();
	      System.out.println(x*y*z);
	  }
	}
}