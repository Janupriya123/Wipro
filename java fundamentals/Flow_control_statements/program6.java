import java.util.Scanner;
public class program6 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char a=sc.next().charAt(0);
      if(a>='a'|| a>='A' && a<='z' || a<='Z')
      {
        System.out.println("Alphabet");
      } 
      else if(a>='0' && a<='9')
      {
        System.out.println("Digit");
      } 
      else
      {
        System.out.println("Special Character");
      }
      sc.close();
    }
}
