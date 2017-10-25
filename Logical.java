import java.lang.*;
import java.io.*;
class Logical
{
    public static void logi() throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int ch1,ch2;
        System.out.println("choose any one operation");
        System.out.println("1.Factorial");
        System.out.println("2.Factors");
        System.out.println("3.check for even or odd");
        System.out.println("4.check for prime number");
        System.out.println("5.check for pallindrome number");
        System.out.println("6.check leap yearor not");
        System.out.println("7.Fibonacci Series");
        System.out.println("8.check for armstrong number");
        System.out.println("9.check perfect number or not");
        ch1=Integer.parseInt(b.readLine());
     switch(ch1)
     {
            case 1:
            System.out.println("Enter number");
            double i=Double.parseDouble(b.readLine());
           double z=1;
         for(double x=1;i<=i;x++)
         { 
             z*=i;
            }
          System.out.println("factorial value of "+i+" is "+z);
        
            break;
            case 2:
            System.out.println("Enter number");
            i=Double.parseDouble(b.readLine());
            for(int x=1;x<=i;x++)
          {
           if(i%x==0)
            System.out.println("Factors are "+x);
          }
            break;
            case 3:
            System.out.println("Enter number");
            i=Double.parseDouble(b.readLine());
             if(i%2==0)
             System.out.println("its EVEN");
             else
             System.out.println("its ODD");
            break;
            case 4:
           System.out.println("Enter number");
            double x=Double.parseDouble(b.readLine());
            int flag=1;    
       for(i=2;i<x;i++ )
       {
		 if(x%i==0)
		 {
		  flag = 0;
		 }
	   }  

	    if(flag==0)
	    {
	      System.out.println( "Number is Composite." );
	     }
	      else
	      System.out.println( "Number is Prime." );
            break;
            case 5:
           System.out.println("Enter number");
            i=Double.parseDouble(b.readLine());
            double rn=0,a=i,r;
           
        while(i!=0)
        {
            r=i%10;
            rn=(rn*10)+r;
            i=i/10;
        }
        if(a==rn)
        System.out.println("It is a PALINDROME");
        else
        System.out.println("It is NOT a PALINDROME");
            break;
            case 6:
           System.out.println("Enter year");
            i=Double.parseDouble(b.readLine());
            if(i%100==0)
            {
                if(i%400==0)
                
            System.out.println("It is a Century Leap Year");
            else
            System.out.println("It is a Century but NOT a Leap Year");
            }
            if(i%4==0)
            System.out.println("It is a  Leap Year");
            else
            System.out.println("It is a NOT Leap Year");
            break;
            case 7:
           System.out.println("Enter number of terms");
           i=Integer.parseInt(b.readLine());
           
            long first=0,second=1,third;
            System.out.println(first+"\t"+second);
            for(x=2;x<i;x++)
            {
                {
                    third=first+second;
                    System.out.println("\t"+third);
                    first=second;
                    second=third;
                }
            }
            break;
         case 8 : System.out.println("Enter number");
           int m = Integer.parseInt(b.readLine());
            int d1,d3,d2,n;
            d1 = m%10;
            d2 = ((m/10)%10);
            d3 = m%100;
            n =(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
           if(n==m)
            System.out.println("It is a armstrong number");
            else
            System.out.println("It is not a Armstrong number");
            break;
            case 9:
            System.out.println("Enter number");
            int t=Integer.parseInt(b.readLine());
            int s=0,mid=t/2;
            for(x=1;x<=mid;x++)
            {
                if(t%x==0)
                s+=x;
            }
           if(s==t)
            System.out.println("It is a Perfect number");
            else
            System.out.println("It is not a Perfect number");
            break;
            default:System.out.println("Wrong Choice");
            break;
        }
    }
}