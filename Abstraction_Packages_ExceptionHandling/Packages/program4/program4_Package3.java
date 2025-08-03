package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Ford extends Vehicle
  {
    public String getModelName() 
    {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() 
    {
        return "TN07HY4567";
    }

    public String getOwnerName()
    {
        return "Meena";
    }

    public int speed()
    {
        return 95;
    }

    public int tempControl()
    {
        System.out.println("Air conditioning is now set.");
        return 1;
    }
}
