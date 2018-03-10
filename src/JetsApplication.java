import java.util.Scanner;

public class JetsApplication {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();

    System.out.println("Select an available Jet to see its stats.");

    // run through array
    while (true) {
      for (int i = 0; i < jets.length; i++) {
        if (jets[i] != null) {
          System.out.println(i + 1 + ": " + jets[i].getModel());
        }
      }
      // select jet with method, accounting for 0->1 for selections
      int jetSelection = input.nextInt();
      selectPlane(jetSelection - 1, jets);

    }
    // jets[0].fly();
    // jets[1].fly();
    // jets[2].fly();
    // jets[3].fly();
  }

  public static void selectPlane(int selection, Jet[] jetsArry) {
    jetsArry[selection].getPlaneStats();
  }
  
 
}
