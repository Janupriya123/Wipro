package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle 
{
    public String getModelName()
  {
        return "Honda Shine";
    }

    public String getRegistrationNumber() 
  {
        return "TN02XY5678";
    }

    public String getOwnerName()
  {
        return "Priya";
    }

    public int getSpeed() 
  {
        return 70;
    }

    public void cdplayer() 
   {
        System.out.println("CD Player is playing.");
    }
}
