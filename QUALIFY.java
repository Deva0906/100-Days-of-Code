import java.util.Scanner;

class Day14
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int X=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            if((A*1+B*2)>=X)
            System.out.println("Qualify");
            else
            System.out.println("Not Qualify");
            T--;
        }
    }
}