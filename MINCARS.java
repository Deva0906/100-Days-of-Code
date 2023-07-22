import java.util.Scanner;

class Day15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=sc.nextInt();
            if(N<=4)
                System.out.println(1);
            else
            {
                if(N%4==0)
                  System.out.println(N/4);
                else
                 System.out.println((N/4)+1);
            }
        }
    }
}