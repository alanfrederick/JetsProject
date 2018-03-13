//create an airfield to store/hold jets
public class AirField {

  private static Jet[] jets = new Jet[10];

  public AirField() {

    Jet cargo1 = new CargoPlane("Boeing 747", 400, 2000, 50_000_000);
    Jet cargo2 = new CargoPlane("Antonov 224", 350, 2300, 68_000_000);
    Jet cargo3 = new CargoPlane("Boeing C17", 580, 3400, 87_000_000);
    Jet fighter1 = new FighterJet("F-22 Raptor", 680, 1000, 98_000_000);
    Jet fighter2 = new FighterJet("Mig 21", 800, 5000, 34_000_000);

    jets[0] = cargo1;
    jets[1] = cargo2;
    jets[2] = cargo3;
    jets[3] = fighter1;
    jets[4] = fighter2;

  }

  public static Jet getFastestPlane() {
    double maxValue2, maxValue;
    maxValue2 = 0;
    Jet j = new JetImpl();
    for (int i = 0; i < jets.length; i++) {
      if (jets[i] != null) {
        maxValue = jets[i].getSpeed();
        if (maxValue2 < maxValue) {
          maxValue2 = maxValue;
          j = jets[i];
        }
      }
    }
    return j;
  }

  public static Jet getLongestDistance() {
    Jet j = jets[0];
    for (int i = 1; i < jets.length; i++) {
      if (jets[i] != null) {
        if (jets[i].getRange() > j.getRange()) {
          j = jets[i];
        }
      }
    }
    return j;
  }

  public void addJet(Jet jetty) {
    for (int i = 0; i < jets.length; i++) {
      if (jets[i] == null) {
        jets[i] = jetty;
        break;
      }
    }

  }

  public AirField(Jet[] jets) {
    super();
    this.jets = jets;
  }

  public Jet[] getJets() {
    return jets;
  }

  public void setJets(Jet[] jets) {
    this.jets = jets;
  }

}
