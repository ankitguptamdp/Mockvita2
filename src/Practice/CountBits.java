package Practice;

import java.util.Scanner;

public class CountBits
{
    public static int countSetBitsFast(int n)
    {
        int count = 0;
        while (n > 0)
        {
            n &= (n - 1) ;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String string=sc.next();
        String[] stringArray=string.split(",");
        int[] intArray=new int[stringArray.length];
        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]=Integer.parseInt(stringArray[i]);
        }
        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]=countSetBitsFast(intArray[i]);
        }
        int count=0;
        for(int i=0;i<intArray.length-1;i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[i]>intArray[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
