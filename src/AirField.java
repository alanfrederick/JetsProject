//create an airfield to store/hold jets
public class AirField {
  
  public AirField() {
    
  }

  public AirField(Jet[] jets) {
    super();
    this.jets = jets;
  }

  // create 'jets' array, holding max of 5 jets
  private Jet[] jets = new Jet[4];{
  CargoPlane cargo1 = new CargoPlane("747", 400, 2000, 50_000_000);
  CargoPlane cargo2 = new CargoPlane("Antonov 224", 350, 2300, 68_000_000);
  FighterJet fighter1 = new FighterJet("F-22 Raptor", 680, 1000, 98_000_000);
  FighterJet fighter2 = new FighterJet("Mig 21", 800, 5000, 34_000_000);
  
  jets[0] = cargo1;
  jets[1] = cargo2;
  jets[2] = fighter1;
  jets[3] = fighter2;
  }
  

//  // getter/setters for jets array
//  public Jet[] getJets() {
//    return jets;
//  }
//
//  public void setJets(Jet[] jets) {
//    this.jets = jets;
//  }

}
