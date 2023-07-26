import java.util.Scanner;

class Day23
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((b>=a && a>=c)||(b<=a && a<=c))
                System.out.println(a);
            else if((a>=b && b>=c)||(a<=b && b<=c))
               System.out.println(b);
            else
               System.out.println(c);
        }
    }
}
