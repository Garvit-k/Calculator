import java.lang.*;
import java.io.*;
class Aritmetic
{
    public static void arith() throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        double ans=0,n;
        int ch1,ch2,i;
        System.out.println("choose any one operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        ch1=Integer.parseInt(b.readLine());
        switch(ch1)
        {
            case 1:
            System.out.println("Enter number of terms to add");
            i=Integer.parseInt(b.readLine());
            ans=0;
            for(int x=1;x<=i;x++)
            {
                System.out.println("Enter number to add");
                n=Double.parseDouble(b.readLine());
                ans+=n;
            }
            break;
            case 2:
            System.out.println("Enter number of terms to substract");
            i=Integer.parseInt(b.readLine());
            ans=0;
            for(int x=1;x<=i;x++)
            {
                System.out.println("Enter number to subtract");
                n=Double.parseDouble(b.readLine());
               ans-=n;
            }
            break;
            case 3:
            System.out.println("Enter number of terms to multiply");
            i=Integer.parseInt(b.readLine());
            ans=1;
            for(int x=1;x<=i;x++)
            {
                System.out.println("Enter number to Multiply");
                n=Double.parseDouble(b.readLine());
                ans*=n;
            }
            break;
            case 4:
             System.out.println("Enter number of terms to divide");
            i=Integer.parseInt(b.readLine());
            ans=1;
            for(int x=1;x<=i;x++)
            {
                System.out.println("Enter number to divide");
                n=Double.parseDouble(b.readLine());
                ans/=n;
            }
            break;
            default:
            System.out.println("WRONG CHOICE");
            break;
        }
        System.out.println("ANSWER IS  "+ans);
    }
}
