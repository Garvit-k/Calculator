import java.io.*;
import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
     try
     {       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int choice=0,tryer=0;
       do
       {
        
         System.out.println("choose any one Option\n1.Arithmetic Calculations\n2.Exponential Calculations\n3.Trignometric calculations");
         System.out.println("4.Logical calculations\n5.Others\n6.Exit");
         choice=Integer.parseInt(br.readLine());
         switch(choice)
          {
             case 1:
                   Aritmetic ar=new Aritmetic();
                   ar.arith();
                   break;
             case 2:
                   Exponential ex=new Exponential();
                   ex.expo();
                   break;
             case 3:
                   Trignometric tr=new Trignometric();
                   tr.trig();
                   break;
             case 4:
                   Logical lo=new Logical();
                   lo.logi();
                   break;
             case 5:
                   Others ot=new Others();
                   ot.oth();
                   break;
             case 6:
                   System.exit(0);
                   break;
             default:
                   System.out.println("Wrong Choice");
          }
          System.out.println("\nDo You Want to try Again ?");
          System.out.println("Enter 1 for YES\nFor NO enter 0\n");
          tryer= Integer.parseInt(br.readLine());
       }while(tryer==1);
       System.exit(0);
     }
        catch(Exception e)
        {
            System.out.println("There was some error");
            System.out.println(e);
        }
    }
}
