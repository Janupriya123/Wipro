class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message)
  {
        super(message);
    }
}
public class program5
{
    public static void main(String[] args)
  {
        if (args.length < 2) {
            System.out.println("Error: Please provide name and age as command-line arguments.");
            return;
        }
        try 
          {
            String name=args[0];
            int age=Integer.parseInt(args[1]);
            if (age<18 || age>=60) 
            {
                throw new InvalidAgeException("Invalid Age: Age must be between 18 and 59.");
            }
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Input accepted.");

        } catch (NumberFormatException e)
          {
            System.out.println("NumberFormatException: Please enter a valid integer for age.");
        } catch (InvalidAgeException e)
          {
            System.out.println("InvalidAgeException:"+e.getMessage());
        }
    }
}

