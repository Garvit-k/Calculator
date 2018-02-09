import java.util.Scanner;

class Trignometric {
    public static void trig() {
        Scanner in = new Scanner(System.in);
        double i,ans=0;
        int ch1;
        System.out.println("Choose any one operation");
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
        ch1=in.nextInt();
        switch(ch1) {
            case 1:
            System.out.println("Enter number");
            i=in.nextInt();
           ans =Math.sin(i) ;
            System.out.println("ans is "+ans);
            break;
            case 2:
            System.out.println("Enter number");
            i=in.nextInt();
            ans =Math.cos(i) ;
            System.out.println("ans is "+ans);
            break;
            case 3:
            System.out.println("Enter number");
            i=in.nextInt();
             ans =Math.tan(i) ;
            System.out.println("ans is "+ans);
            break;
            case 5:
           System.out.println("Enter angle");
            i=in.nextInt();
            ans=Math.acos(i);
            System.out.println("ans is "+ans);
            break;
            case 4:
           System.out.println("Enter angle");
            i=in.nextInt();
            ans=Math.asin(i);
            System.out.println("ans is "+ans);
            break;
            case 6:
           System.out.println("Enter angle");
            i=in.nextInt();
            ans=Math.atan(i);
            System.out.println("ans is "+ans);
            break;
            case 7:
           System.out.println("Enter angles");
            int x=in.nextInt();
            int y=in.nextInt();
            ans=Math.atan2(x,y);
            System.out.println("ans is "+ans);
            break;
            case 8:
           System.out.println("Enter number");
            i=in.nextInt();
            ans=Math.log(i);
            System.out.println("ans is "+ans);
            break;
            
            default:System.out.println("Wrong Choice");
            break;
        }
    }
}