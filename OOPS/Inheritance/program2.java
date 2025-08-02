 public class Person 
 {
    private String name;

    public Person(String name)
   {
        this.name=name;
    }

    public String getName() 
   {
        return name;
    }

    public void setName(String name) 
   {
        this.name=name;
    }
}
 
public class Employee extends Person 
{
    private double annualsalary;
    private int yearstarted;
    private String nationalinsurancenumber;

    public Employee(String name, double annualsalary, int yearstarted, String nationalinsurancenumber) 
  {
        super(name);
        this.annualsalary=annualsalary;
        this.yearstarted=yearstarted;
        this.nationalinsurancenumber=nationalinsurancenumber;
    }

    public double getAnnualsalary() {
        return annualsalary;
    }

    public void setAnnualSalary(double annualsalary)
  {
        this.annualsalary=annualsalary;
    }

    public int getYearStarted() 
  {
        return yearstarted;
    }

    public void setYearStarted(int yearStarted)
  {
        this.yearstarted=yearstarted;
    }

    public String getNationalInsuranceNumber()
  {
        return nationalinsurancenumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber)
  {
        this.nationalinsurancenumber=nationalinsurancenumber;
    }
}
 
public class TestEmployee 
{
    public static void main(String[] args) 
  {
        Employee emp = new Employee("Alice", 50000.0, 2021, "N123456");

        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}
