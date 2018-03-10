import java.util.Scanner;

public class JetsApplication {

  public static void main(String[] args) {
    flyTheJets();

  }

  public static void planeStatsMenu() {
    Scanner input = new Scanner(System.in);
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();
    System.out.println("Select an available Jet to see its stats.");
    // run through array for fleet selection
    while (true) {
      for (int i = 0; i < jets.length; i++) {
        if (jets[i] != null) {
          System.out.println(i + 1 + ": " + jets[i].getModel());
        }
      }
      // select jet with method, accounting for 0->1 for selections
      int fleetSelection = input.nextInt();
      selectPlane(fleetSelection - 1, jets);
    }
  }

  // fly the jets method
  public static void flyTheJets() {
    Scanner input = new Scanner(System.in);
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();
    System.out.println("Select an available Jet to see if fly!");
    while (true) {
      for (int i = 0; i < jets.length; i++) {
        if (jets[i] != null) {
          System.out.println(i + 1 + ": " + jets[i].getModel());
        }
      }
      // select jet with method, accounting for 0->1 for selections
      int fleetSelection = input.nextInt();
      selectPlaneToFly(fleetSelection - 1, jets);
    }

  }

  public static void selectPlane(int selection, Jet[] jetsArry) {
    jetsArry[selection].getPlaneStats();
  }
  
 public static void selectPlaneToFly(int selection, Jet[] jetsArry) {
   jetsArry[selection].fly();
 }
}
