import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for C to F and 2 for F to C");
        System.out.println("Enter choice");
        int choice=sc.nextInt();
        double temp;
        switch (choice)
        {
            case 1:
                System.out.println("Enter temperature in celsius");
                temp=sc.nextDouble();
                double C=temp;
                System.out.println((9*C/5)+32);
                break;
            case  2:
                System.out.println("Enter temperature in fahrenheit");
                temp=sc.nextDouble();
                double F=temp;
                System.out.println(((F-32)*5)/9);
        }
    }
}
