import java.lang.*;
import java.io.*;
class Exponential
{
    public static void expo() throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        double i,ans=0;
        int ch1,ch2;
        System.out.println("choose any one operation");
        System.out.println("1.Square");
        System.out.println("2.Cube");
        System.out.println("3.x to the power y");
        System.out.println("4.Squareroot");
        ch1=Integer.parseInt(b.readLine());
        switch(ch1)
        {
            case 1:
            System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
           ans = i*i ;
            System.out.println("ANSWER IS  "+ans);
            break;
            case 2:
            System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
           ans=i*i*i;
            System.out.println("ANSWER IS  "+ans);
            break;
            case 3:
            System.out.println("Enter base  number");
            int x=Integer.parseInt(b.readLine());
            System.out.println("Enter power");
            int y=Integer.parseInt(b.readLine());
            ans=Math.pow(x,y);
            System.out.println("ANSWER IS  "+ans);
            break;
            case 4:
           System.out.println("Enter number");
            i=Integer.parseInt(b.readLine());
            ans=Math.sqrt(i);
            System.out.println("ANSWER IS  "+ans);
            break;
            default:System.out.println("WRONG CHOICE");
            break;
        }
    }
}