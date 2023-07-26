import java.util.Scanner;

class Day22 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            int arr[]=new int[N];
            int Ai=0;
            for(int j=0;j<N;j++)
            {
                arr[j]=sc.nextInt();
                if(arr[j]!=0)
                   Ai=j;
            }
            System.out.println(Ai);
        }
    }
}
