import java.util.*;
import java.io.*;
class Trignometric
{
    public static void trig() throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        double i,ans=0;
        int ch1,ch2;
        System.out.println("choose any one operation");
        System.out.println("In Radians");
        System.out.println("1.sine");
        System.out.println("2.consine");
        System.out.println("3.Tangent");
        System.out.println("whithot radians");
        System.out.println("4.Angle whose sine is");
        System.out.println("5.Angle whose consine is");
        System.out.println("6.Angle whose tangent is");
        System.out.println("7.Angle whose trangent is x/y is");
        System.out.println("8.logarithm");
        ch1=Integer.parseInt(b.readLine());
        switch(ch1)
        {
            case 1:
            System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
           ans =Math.sin(i) ;
            System.out.println("ans is "+ans);
            break;
            case 2:
            System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
            ans =Math.cos(i) ;
            System.out.println("ans is "+ans);
            break;
            case 3:
            System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
             ans =Math.tan(i) ;
            System.out.println("ans is "+ans);
            break;
            case 5:
           System.out.println("Enter angle");
            i=Integer.parseInt(b.readLine());
            ans=Math.acos(i);
            System.out.println("ans is "+ans);
            break;
            case 4:
           System.out.println("Enter angle");
            i=Integer.parseInt(b.readLine());
            ans=Math.asin(i);
            System.out.println("ans is "+ans);
            break;
            case 6:
           System.out.println("Enter angle");
            i=Integer.parseInt(b.readLine());
            ans=Math.atan(i);
            System.out.println("ans is "+ans);
            break;
            case 7:
           System.out.println("Enter angles");
            int x=Integer.parseInt(b.readLine());
            int y=Integer.parseInt(b.readLine());
            ans=Math.atan2(x,y);
            System.out.println("ans is "+ans);
            break;
            case 8:
           System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
            ans=Math.log(i);
            System.out.println("ans is "+ans);
            break;
            
            default:System.out.println("Wrong Choice");
            break;
        }
    }
}