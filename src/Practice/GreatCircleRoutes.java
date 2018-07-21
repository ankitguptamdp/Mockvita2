package Practice;

import java.util.Scanner;

public class GreatCircleRoutes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double totalDistance=0;

        String coordinate1=sc.next();
        String[] stringArray1=coordinate1.split(",");

        String latitudeString1="";
        for(int i=0;i<stringArray1[0].length()-1;i++)
        {
            latitudeString1+=stringArray1[0].charAt(i);
        }
        double latitude1=Integer.parseInt(latitudeString1);
        latitude1=Math.toRadians(latitude1);
        char northOrSouth1 = stringArray1[0].charAt(stringArray1[0].length()-1);

        String longitudeString1="";
        for(int i=0;i<stringArray1[1].length()-1;i++)
        {
            longitudeString1+=stringArray1[1].charAt(i);
        }
        double longitude1=Integer.parseInt(longitudeString1);
        longitude1=Math.toRadians(longitude1);
        char eastOrWest1 = stringArray1[1].charAt(stringArray1[1].length()-1);

        for(int j=0;j<n-1;j++)
        {
            String coordinate2=sc.next();
            String[] stringArray2=coordinate2.split(",");

            String latitudeString2="";
            for(int i=0;i<stringArray2[0].length()-1;i++)
            {
                latitudeString2+=stringArray2[0].charAt(i);
            }
            double latitude2=Integer.parseInt(latitudeString2);
            latitude2=Math.toRadians(latitude2);
            char northOrSouth2 = stringArray2[0].charAt(stringArray2[0].length()-1);

            String longitudeString2="";
            for(int i=0;i<stringArray2[1].length()-1;i++)
            {
                longitudeString2+=stringArray2[1].charAt(i);
            }
            double longitude2=Integer.parseInt(longitudeString2);
            longitude2=Math.toRadians(longitude2);
            char eastOrWest2 = stringArray2[1].charAt(stringArray2[1].length()-1);

            double diffLatitude;
            if(northOrSouth1==northOrSouth2)
            {
                diffLatitude=Math.abs(latitude1-latitude2);
            }
            else
            {
                diffLatitude=latitude1+latitude2;
            }
            if(diffLatitude>180)
            {
                diffLatitude=360-diffLatitude;
            }

            double diffLongitude;
            if(eastOrWest1==eastOrWest2)
            {
                diffLongitude=Math.abs(longitude1-longitude2);
            }
            else
            {
                diffLongitude=longitude1+longitude2;
            }
            if(diffLongitude>180)
            {
                diffLongitude=360-diffLongitude;
            }
            
            //Haversine Angle
            double angle=Math.pow(Math.sin(diffLatitude/2),2)+Math.cos(latitude1)*Math.cos(latitude2)*Math.pow(Math.sin(diffLongitude/2),2);
            double distance=2*6400*Math.asin(Math.sqrt(angle));
            totalDistance+=distance;

            latitude1=latitude2;
            northOrSouth1=northOrSouth2;
            longitude1=longitude2;
            eastOrWest1=eastOrWest2;

        }
        System.out.println(Math.round(totalDistance));
    }
}
