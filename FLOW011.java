import java.util.Scanner;

class Day21
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int S=sc.nextInt();
            double GS,HRA,DA;
            if(S<1500)
            {
                HRA=S*0.1;
                DA=S*0.9;
            }
            else
            {
                HRA=500;
                DA=S*0.98;
            }
            GS=S+HRA+DA;
            System.out.format("%.2f",GS);
        }
    }
}
