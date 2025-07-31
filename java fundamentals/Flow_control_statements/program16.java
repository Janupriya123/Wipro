import java.util.Scanner;
public class program16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int o=n;
        int r=0;
        while (n!=0) 
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
       if (o==r) 
       {
            System.out.println("Palindrome");
        } 
        else 
        {
            System.out.println("NotPalindrome");
        }
        sc.close();
    }
}
