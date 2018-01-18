import java.util.Scanner;

class Others {
    public static void oth() {
        Scanner in = new Scanner(System.in);
        int ch1,ch2,i;
        System.out.println("Choose any one operation");
        System.out.println("1.Maximum");
        System.out.println("2.Minimum");
        System.out.println("3.Round up");
        System.out.println("4.Accounting");
        System.out.println("5.Perimeter of a Figure");
        System.out.println("6.Area/Total Surface Area of a Figure");
        System.out.println("7.Volume of a Figure");
        ch1=in.nextInt();
        switch(ch1) {
            case 1:
            System.out.println("Enter number of terms whose Maximum is to be found");
            i=in.nextInt();
            double  max=0; double num=0;
            for(int x=1;x<=i;x++) {
                System.out.println("Enter number and press Enter key");
                num=in.nextDouble();
                if(num>max)
                max=num;
            }
            System.out.println("Max is"+max);
            break;
            case 2:
             System.out.println("Enter 3 number whose Minimum is to be found");
            int x=in.nextInt();
            int z=in.nextInt();
            int y=in.nextInt();
            System.out.println("Min is "+Math.min(x,(Math.min(y,z))));
            break;
            case 3:
            System.out.println("Enter the number to round up");
            double q=in.nextDouble();
            System.out.println("Rounded up value is "+Math.ceil(q));
            break;
            case 4:
              System.out.println("choose any one operation");
              System.out.println("1.S.I.");
              System.out.println("2.C.I.");
              System.out.println("3.Amount on S.I.");
              System.out.println("4.Amount on C.I.");
              ch2 = in.nextInt();
              double P=0,R=0,T=0;
              switch(ch2) {
                  case 1:
                  System.out.println("Enter Principle");
                  P=in.nextDouble();
                  System.out.println("Enter Rate");
                  R=in.nextDouble();
                  System.out.println("Enter Time in YEARS");
                  T=in.nextDouble();
                  double SI=(P*R*T)/100;
                  System.out.println("S.I. is "+SI);
                  break;
                  case 2:
                  System.out.println("Enter Principle");
                  P=in.nextDouble();
                  System.out.println("Enter Rate");
                  R=in.nextDouble();
                  System.out.println("Enter Time in YEARS");
                  T=in.nextDouble();
                  double f=(1+(R/100));
                  double CI=P*(Math.pow(f,T));;
                  System.out.println("C.I. is "+(CI-P));
                  break;
                  case 3:
                  System.out.println("Enter Principle");
                  P=in.nextDouble();
                  System.out.println("Enter Rate");
                  R=in.nextDouble();
                  System.out.println("Enter Time in YEARS");
                  T=in.nextDouble();
                  double SI1=(P*R*T)/100;
                  System.out.println("S.I. is "+(SI1+P));
                  break;
                  case 4:
                  System.out.println("Enter Principle");
                  P=in.nextDouble();
                  System.out.println("Enter Rate");
                  R=in.nextDouble();
                  System.out.println("Enter Time in YEARS");
                  T=in.nextDouble();
                  double x1=(1+(R/100));
                  double CIamt=P*(Math.pow(x1,T));;
                  System.out.println("C.I. is "+CIamt);
                  break;
                  default:System.out.println("Wrong Choice");
                  break;
                }
                case 5:
                System.out.println("Choose any one option ");
                System.out.println("1.Any Sided Polygon");
                System.out.println("2.Circle");
                ch2=in.nextInt();
                switch(ch2) {
                    case 1:
                    System.out.println("Enter the number of sides the Polygon is having");
                    int u=in.nextInt();
                    double sum=0, side;
                    for(int p0=1;p0<=u;p0++) {
                  System.out.println("Enter one Side and press ENTER key ");
                  side=in.nextDouble();
                  sum+=side;
                 }
                 System.out.println("Perimeter is"+sum);
                 break;
                 case 2:
                 System.out.println("Enter radius of the circle");
                 double radius=in.nextDouble();
                 double peri=2*Math.PI*radius;
                 System.out.println("Circumference is "+peri);
                 break;
                 default:System.out.println("Wrong Choice");
                 break;
                }
                break;
                case 6:
                System.out.println("Choose any One figure");
                System.out.println("1.Square");
                System.out.println("2.Triangle");
                System.out.println("3.Rectrangle");
                System.out.println("4.Circle");
                System.out.println("5.Cone");
                System.out.println("6.Sphere");
                System.out.println("7.Cube");
                System.out.println("8.Cuboid");
                System.out.println("9.Cylinder");
                ch2=in.nextInt();
                switch(ch2) {
                case 1:
                System.out.println("Enter one Side");
                double sidesq=in.nextDouble();
                System.out.println("Area is "+(sidesq*sidesq));
                break;
                case 2:
                System.out.println("Enter sides one by one");
                double areatri=0;
                for(i=1;i>=3;i++) {
                    double sidetri=in.nextDouble();
                    areatri+=sidetri;
                }   
                System.out.println("Area is "+areatri);
                break;
                case 3:
                System.out.println("Enter Length");
                double l=in.nextDouble();
                System.out.println("Enter Breadth");
                double B=in.nextDouble();
                System.out.println("Area is "+(l*B));
                break;
                case 4:
                System.out.println("Enter Radius");
                double radi=in.nextDouble();
                System.out.println("Area is"+(2*Math.PI*radi));
                break;
                case 5:
                System.out.println("Enter Radius");
                radi=in.nextDouble();
                System.out.println("Enter Height");
                double height=in.nextDouble();
                System.out.println("Total Surface Area is "+(Math.PI*radi*(height*radi)));
                break;
                case 6:
                System.out.println("Enter Radius");
                radi=in.nextDouble();
                System.out.println("Total Surface Area is "+(4*Math.PI*radi*radi));
                break;
                case 7:
                System.out.println("Enter one Side");
                sidesq=in.nextDouble();
                System.out.println("Total Surface Area is "+(6*sidesq*sidesq));
                break;
                case 8:
                System.out.println("Enter Length");
                l=in.nextDouble();
                System.out.println("Enter Breadth");
                B=in.nextDouble();
                System.out.println("Enter Height");
                double H=in.nextDouble();
                System.out.println("Total Surface Area is "+(2*(l*B+B*H+H*l)));
                break;
                case 9:
                System.out.println("Enter Radius");
                radi=in.nextDouble();
                System.out.println("Enter Height");
                height=in.nextDouble();
                System.out.println("Total Surface Area is "+(2*Math.PI*radi*(radi+height)));
                break;
                default:System.out.println("Wrong Choice");
                break;
            }
            break;
            case 7:
            System.out.println("Choose one figure");
            System.out.println("1.Cube");
            System.out.println("2.Cuboid");
            System.out.println("3.Sphere");
            System.out.println("4.Cone");
            System.out.println("5.Cylinder");
            ch2=in.nextInt();
            switch(ch2) {
                case 1:
                System.out.println("Enter one Side");
                double sidesq=in.nextDouble();
                System.out.println("Volume is "+(sidesq*sidesq*sidesq));
                break;
                case 2:
                System.out.println("Enter Length");
                double l=in.nextDouble();
                System.out.println("Enter Breadth");
                double B=in.nextDouble();
                System.out.println("Enter Height");
                double H=in.nextDouble();
                System.out.println("Volume is "+(l*B*H));
                break;
                case 3:
                System.out.println("Enter Radius");
                double radi=in.nextDouble();
                System.out.println("Volume is "+((4/3)*Math.PI*radi*radi*radi));
                break;
                case 4:
                System.out.println("Enter Radius");
                radi=in.nextDouble();
                System.out.println("Enter Height");
                double height=in.nextDouble();
                System.out.println("Volume is "+(Math.PI*radi*radi*(height/3)));
                case 5:
                System.out.println("Enter Radius");
                radi=in.nextDouble();
                System.out.println("Enter Height");
                height=in.nextDouble();
                System.out.println("Volume is "+(Math.PI*radi*radi*height));
                break;
                default:System.out.println("Wrong Choice");
                break;
            }
            break;
            default:System.out.println("Wrong Choice");
            break;
        }
    }
}