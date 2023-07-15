import java.util.Scanner;

class Day4
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
		for(int i=0;i<T;i++)
{
int K=sc.nextInt();
		    int X=sc.nextInt();
		    if(K>=X){
		        System.out.println(K-X);
}
else
{
System.out.println(X-K);
}
}
}
}