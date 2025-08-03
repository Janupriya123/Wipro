import java.util.Scanner;
public class program8
{
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
       for(int i=0;i<n;i++) 
       {
            arr[i]=sc.nextInt();
        }
       int sum=0;
       boolean skip=false;
       for(int num:arr)
         {
            if(num==6) {
                skip=true;
                continue;
            }
            if (num==7&&skip) 
            {
                skip=false;
                continue;
            }
            if(!skip) 
            {
                sum +=num;
            }
        }
     System.out.println("Sum"+sum);
     sc.close();
    }
}
