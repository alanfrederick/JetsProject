
public class CargoPlane extends Jet implements CargoCarrier {

  public CargoPlane(String model, double speed, int range, long price) {
    super(model, speed, range, price);
    // TODO Auto-generated constructor stub
  }


  public void loadCargo() {
System.out.println("Putting stuff in...");
  }


  public void unloadCargo() {
System.out.println("Taking stuff out...");
  }

}
