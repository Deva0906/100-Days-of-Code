import java.util.Scanner;

class Day10
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0;i<T;i++)
       {
           int X=sc.nextInt();
           int Y=sc.nextInt();
           System.out.println((X*10)+(Y*5));
       }
    }
}