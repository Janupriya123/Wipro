import java.util.Scanner;
import java.util.Arrays;
public class program9
{
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] res=new int[n];
        int ind=0;
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
            if(arr[i]!=10)
            {
                res[ind++]=arr[i];
            }
        }
     for(int i=0;i<n;i++)
       {
         System.out.print(res[i]+" ");
       }
     sc.close();
    }
}
