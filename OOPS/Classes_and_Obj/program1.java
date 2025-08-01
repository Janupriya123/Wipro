import java.util.Scanner;
class Box {
    double w, h,b;
    Box(double width, double height, double breadth) 
  {
        this.w=width;
        this.h=height;
        this.b=breadth;
    }
   public static double volume() 
  {
        return width*height*breadth;
    }
}

class Calculator 
{
     public static int powerInt(int num1, int num2)
    {
        return (int) Math.pow(num1, num2);
    }
     public static double powerDouble(double num1, int num2) 
    {
        return Math.pow(num1, num2);
    }
}

public class Main
  {
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double b=sc.nextDouble();
        Box box=new Box(w,h,b);
        int ibase=sc.nextInt();
        int iexp=sc.nextInt();
        System.out.println("Result of powerInt " + Calculator.powerInt(ibase,iexp));
        double dbase=sc.nextDouble();
        int  dexp=sc.nextInt();
        System.out.println("Result of powerDouble " + Calculator.powerDouble(dbase,dexp));
        sc.close();
   }
}
