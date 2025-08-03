package com.automobile.fourwheeler;
import com.automobile.Vehicle;

public class Logan extends Vehicle
  {
    public String getModelName()
    {
        return "Logan Sedan";
    }

    public String getRegistrationNumber() 
    {
        return "TN09ZX0001";
    }

    public String getOwnerName()
    {
        return "Ravi Kumar";
    }

    public int speed() 
    {
        return 85;
    }

    public int gps()
    {
        System.out.println("GPS is ON.");
        return 1;
    }
}
