//abstract class for Jets

public abstract class Jet {
  // Create fields for a Jet
  private String model;
  private double speed;
  private int range;
  private long price;

  // Jet constructor
  public Jet(String model, double speed, int range, long price) {
    super();
    this.model = model;
    this.speed = speed;
    this.range = range;
    this.price = price;
  }

  // fly method
  public void fly() {
    System.out.println("Lets get this bird in the air!");
  }

  public double getSpeedInMach(double mach, int mph) {
    // mach = miles per hour × 0.001303
    mach = mph * 0.001303;
    return mach;
  }

  // getters and setters
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public int getRange() {
    return range;
  }

  public void setRange(int range) {
    this.range = range;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

}