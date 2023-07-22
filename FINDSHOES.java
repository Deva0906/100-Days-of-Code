import java.util.Scanner;

class Day19 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(M==0) 
               System.out.println(N*2);
            else if((N-M)>0)
            {
                System.out.println((N-M)+N);
            }
            else 
               System.out.println(N);
        }
    }
}