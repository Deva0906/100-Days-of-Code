import java.util.Scanner;

class Day16 
{
    public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            if(N%X==0) 
               System.out.println("YES");
            else
               System.out.println("NO");
        }
    }
}
