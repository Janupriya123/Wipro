public class program3 {
    public static void main(String[] args) {
        if(args.length!=2)
        {
            System.out.println("Two arguments are required");
            return;
        }
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        System.out.println(a+b);
    }
}
