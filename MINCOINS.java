import java.util.Scanner;

class Day20
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int X=sc.nextInt();
            if(X%5==0)
            {
                if(X%10==0)
                    System.out.println(X/10);
                else
                {
                    System.out.println((X/10)+1);
                }
            }
            else
               System.out.println(-1);
        }
	}
}