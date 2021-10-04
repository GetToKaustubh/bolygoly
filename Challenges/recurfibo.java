package Challenges;
import java.util.*;
public class recurfibo
{
    public static void fibo(int n, int a, int b, int c)
    {
        if(n!=0)
        {
            c=a+b;
            System.out.print(c+" ");
            //c=a+b;
            a=b;
            b=c;
            fibo(n-1,a,b,c);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n terms");
        int n=sc.nextInt();
        fibo(n,-1,1,0);
    }
}
