import java.util.Scanner;
public class program15{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        while (n!=0) 
        {
            int d=n%10;       
            r=r*10+d;      
            n=n/10;            
        }
        sc.close();
    }
}
