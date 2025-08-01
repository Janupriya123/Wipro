import java.util.Scanner;
import java.util.Arrays;
public class program10
{
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
      int s=0;
      int e=n-1;
      for(int num:arr)
        {
            if(num%2==0)
            {
                res[s++]=num;
            } 
            else 
            {
                res[e--]=num;
            }
        }
      for(int i=0;i<n;i++)
        {
          System.out.print(res[i]+" ");
        }
         sc.clsoe();
    }
}
