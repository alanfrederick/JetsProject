//create an airfield to store/hold jets
public class AirField {
  // create 'jets' array, holding max of 5 jets
  private Jet[] jets = new Jet[5];

  // getter/setters for jets array
  public Jet[] getJets() {
    return jets;
  }

  public void setJets(Jet[] jets) {
    this.jets = jets;
  }

}
