import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestAllVehicles
  {
    public static void main(String[] args) 
    {
        Logan loganCar=new Logan();
        System.out.println("Logan Car:");
        System.out.println("Model:"+loganCar.getModelName());
        System.out.println("Reg No:"+loganCar.getRegistrationNumber());
        System.out.println("Owner:"+loganCar.getOwnerName());
        System.out.println("Speed:"+loganCar.speed());
        loganCar.gps();
        System.out.println();

        Ford fordCar=new Ford();
        System.out.println("Ford Car:");
        System.out.println("Model:"+fordCar.getModelName());
        System.out.println("Reg No:"+fordCar.getRegistrationNumber());
        System.out.println("Owner:"+fordCar.getOwnerName());
        System.out.println("Speed:"+fordCar.speed());
        fordCar.tempControl();
    }
}
