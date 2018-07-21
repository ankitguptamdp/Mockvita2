package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BugCrawl
{
    static Map<String,String> map=new HashMap();
    public static void buildMap()
    {
        map.put("1UF","6S");
        map.put("1UB","6N");
        map.put("1UL","6E");
        map.put("1UR","6W");

        map.put("1DF","3S");
        map.put("1DB","3N");
        map.put("1DL","3W");
        map.put("1DR","3E");

        map.put("1EF","5S");
        map.put("1EB","5N");
        map.put("1EL","5D");
        map.put("1ER","5U");

        map.put("1WF","2S");
        map.put("1WB","2N");
        map.put("1WL","2U");
        map.put("1WR","2D");
        


        map.put("2UF","6E");
        map.put("2UB","6W");
        map.put("2UL","6N");
        map.put("2UR","6S");

        map.put("2DF","3E");
        map.put("2DB","3W");
        map.put("2DL","3S");
        map.put("2DR","3N");

        map.put("2NF","1E");
        map.put("2NB","1W");
        map.put("2NL","1D");
        map.put("2NR","1U");

        map.put("2SF","4E");
        map.put("2SB","4W");
        map.put("2SL","4U");
        map.put("2SR","4D");
        


        map.put("3NF","1U");
        map.put("3NB","1D");
        map.put("3NL","1E");
        map.put("3NR","1W");

        map.put("3EF","5U");
        map.put("3EB","5D");
        map.put("3EL","5S");
        map.put("3ER","5N");

        map.put("3WF","2U");
        map.put("3WB","2D");
        map.put("3WL","2N");
        map.put("3WR","2S");

        map.put("3SF","4U");
        map.put("3SB","4D");
        map.put("3SL","4W");
        map.put("3SR","4E");
        


        map.put("4UF","6N");
        map.put("4UB","6S");
        map.put("4UL","6W");
        map.put("4UR","6E");

        map.put("4DF","3N");
        map.put("4DB","3S");
        map.put("4DL","3E");
        map.put("4DR","3W");

        map.put("4EF","5N");
        map.put("4EB","5S");
        map.put("4EL","5U");
        map.put("4ER","5D");

        map.put("4WF","2N");
        map.put("4WB","2S");
        map.put("4WL","2D");
        map.put("4WR","2U");
        


        map.put("5UF","6W");
        map.put("5UB","6E");
        map.put("5UL","6S");
        map.put("5UR","6N");

        map.put("5DF","3W");
        map.put("5DB","3E");
        map.put("5DL","3N");
        map.put("5DR","3S");

        map.put("5NF","1W");
        map.put("5NB","1E");
        map.put("5NL","1U");
        map.put("5NR","1D");

        map.put("5SF","4W");
        map.put("5SB","4E");
        map.put("5SL","4D");
        map.put("5SR","4U");
        


        map.put("6NF","1D");
        map.put("6NB","1U");
        map.put("6NL","1W");
        map.put("6NR","1E");

        map.put("6EF","5D");
        map.put("6EB","5U");
        map.put("6EL","5N");
        map.put("6ER","5S");

        map.put("6WF","2D");
        map.put("6WB","2U");
        map.put("6WL","2S");
        map.put("6WR","2N");

        map.put("6SF","4D");
        map.put("6SB","4U");
        map.put("6SL","4E");
        map.put("6SR","4W");
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String string1=sc.next();
        String string2=sc.next();
        StringBuilder reverseString2 = new StringBuilder();
        reverseString2.append(string2);
        reverseString2 = reverseString2.reverse();
        string2=reverseString2.toString();
        buildMap();
        String finalString="";
        for(int i=0;i<string2.length();i++)
        {
            string1+=string2.charAt(i);
            finalString=map.get(string1);
            string1=finalString;
        }
        System.out.println(finalString);
    }
}
