import java.util.Scanner;

class Aritmetic {
    public static void arith() {
        Scanner in = new Scanner(System.in);
        double n;
        int ch1,i;
        System.out.println("Choose any one operation");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        ch1=in.nextInt();
        switch(ch1) {
            case 1:
            System.out.println("Enter number of terms to add");
            i=in.nextInt();
            double sum=0;
            for(int x=1;x<=i;x++) {
                System.out.println("Enter number to add");
                n=in.nextDouble();
                sum+=n;
            }
            System.out.println("ANSWER IS "+sum);
            break;
            case 2:
            System.out.println("Enter number of terms to substract");
            i=in.nextInt();
            double diff=0;
            for(int x=1;x<=i;x++) {
                System.out.println("Enter number to subtract");
                n=in.nextDouble();
               diff-=n;
            }
            System.out.println("ANSWER IS  "+diff);
            break;
            case 3:
            System.out.println("Enter number of terms to multiply");
            i=in.nextInt();
            double mul=1;
            for(int x=1;x<=i;x++) {
                System.out.println("Enter number to Multiply");
                n=in.nextDouble();
                mul*=n;
            }
            System.out.println("ANSWER IS  "+mul);
            break;
            case 4:
             System.out.println("Enter number of terms to divide");
            i=in.nextInt();
            double div=1;
            for(int x=1;x<=i;x++) {
                System.out.println("Enter number to divide");
                n=in.nextDouble();
                div/=n;
            }
            System.out.println("ANSWER IS  "+div);
            break;
            default:System.out.println("WRONG CHOICE");
            break;
        }
    }
}