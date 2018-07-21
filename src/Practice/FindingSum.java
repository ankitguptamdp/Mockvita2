package Practice;

import java.util.Scanner;

public class FindingSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String firstLine=sc.next();
        String[] stringArray1=firstLine.split(",");
        int N=Integer.parseInt(stringArray1[0]);
        int P=Integer.parseInt(stringArray1[1]);
        String secondLine=sc.next();
        String[] stringArray2=secondLine.split(",");
        int[] intArray=new int[stringArray2.length];
        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]=Integer.parseInt(stringArray2[i]);
        }
        long count=0;
        for(int i=0;i<intArray.length-2;i++)
        {
            for(int j=i+1;j<intArray.length-1;j++)
            {
                for(int k=j+1;k<intArray.length;k++)
                {
                    if((intArray[i]+intArray[j]+intArray[k])%P==0)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count%1009);
    }
}
