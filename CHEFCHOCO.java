import java.util.Scanner;

class Day9 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int C=sc.nextInt();
            int X=sc.nextInt();
            int Y=sc.nextInt();
            System.out.println((C-X)*Y);
            
        }
    }
}