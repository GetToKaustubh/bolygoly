package Challenges;
import java.util.*;
public class reversenum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=(s*10)+d;
            n=n/10;
        }
        System.out.println("Reverse of the number is "+s);
    }
}
