package mainpkg;
import test.foundation;
public class TestAccess 
{
    public static void main(String[] args) 
  {
        foundation f=new foundation();
        System.out.println(f.var1);  //Not accessible  
        System.out.println(f.var2);  //Not accessible  
        System.out.println(f.var3);  //Not accessible  
        System.out.println(f.var4);   
    }
}
