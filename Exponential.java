import java.util.Scanner;

class Exponential {
    public static void expo() {
        Scanner in = new Scanner(System.in);
        double i,ans=0;
        int ch1;
        System.out.println("Choose any one operation");
        System.out.println("1.Square");
        System.out.println("2.Cube");
        System.out.println("3.x to the power y");
        System.out.println("4.Squareroot");
        ch1=in.nextInt();
        switch(ch1) {
            case 1:
            System.out.println("Enter number");
            i=in.nextInt();
           ans = i*i ;
            System.out.println("ANSWER IS  "+ans);
            break;
            case 2:
            System.out.println("Enter number");
            i=in.nextInt();
           ans=i*i*i;
            System.out.println("ANSWER IS  "+ans);
            break;
            case 3:
            System.out.println("Enter base  number");
            int x=in.nextInt();
            System.out.println("Enter power");
            int y=in.nextInt();
            ans=Math.pow(x,y);
            System.out.println("ANSWER IS  "+ans);
            break;
            case 4:
           System.out.println("Enter number");
            i=in.nextInt();
            ans=Math.sqrt(i);
            System.out.println("ANSWER IS  "+ans);
            break;
            
            default:System.out.println("WRONG CHOICE");
            break;
        }
    }
}