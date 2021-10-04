package Challenges;
import java.util.*;
public class primebelow2million {
    public static void main(String[]args)
    {
        long s=0;
        for(long i=2;i<2000000;i++)
        {
            int c=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    c=1;
                }
            }
            if(c==0)
                s+=i;
        }
        System.out.println("sum of prime numbers below 20,00,000: - "+s);
    }
}
