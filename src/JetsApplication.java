import java.util.Arrays;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class JetsApplication {
  // main calls main menu method which drives the program
  public static void main(String[] args) {
    mainMenu();
  }

  // main menu method, providing a menu and options for user
  public static void mainMenu() {
    Scanner input = new Scanner(System.in);
    System.out.println("/*****************************************/");
    System.out.println("  Welcome to the Skill Distillery Airport.\n     Please select a menu option below.");
    System.out.println("/*****************************************/");
    System.out.println("1. List available planes in the Airport.");
    System.out.println("2. Fly a Jet!");
    System.out.println("3. -BROKEN-Add a jet to the Aiport.-BROKEN-");
    System.out.println("4. -BROKEN-Display the fastest jet in the Airport.-BROKEN-");
    System.out.println("5. -BROKEN-Diplay the jet with the furthest range.-BROKEN-");
    System.out.println("0. Exit the Skill Distillery Airport.");
    String menuSelection = input.next();

    // main menu selections
    while (menuSelection != "") {
      if (menuSelection.equals("1")) {
        planeStatsMenu();
        mainMenu();
      } else if (menuSelection.equals("2")) {
        flyTheJets();
        mainMenu();
      } else if (menuSelection.equals("3")) {

      } else if (menuSelection.equals("4")) {
        // broken
        // getFastestPlane();
      } else if (menuSelection.equals("5")) {
        // broken
        // getFurthestRangePlane();
      }

      else if (menuSelection.equals("0")) {
        System.out.println("Have a great day!");
        System.exit(0);

        // repeat menu if user provides invalid input
      } else {
        System.out.println("1. List available planes in the Airport.");
        System.out.println("2. Fly a Jet!");
        System.out.println("3. -BROKEN-Add a jet to the Aiport.-BROKEN-");
        System.out.println("4.-BROKEN- Display the fastest jet in the Airport.-BROKEN-");
        System.out.println("5. -BROKEN-Diplay the jet with the furthest range.-BROKEN-");
        System.out.println("0. Exit the Skill Distillery Airport.");
        menuSelection = input.next();
      }
    }

  }

  // Struggled getting this logic to work (same for distance). The max value //
  // double keeps getting reset on each array pass, so a value // isnt being
  // created to compare with. I believe I'm close here, I've walked // through the
  // logic with the debugger but I'm not catching the hiccup here.

  public static void getFastestPlane() {
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();

    for (int i = 0; i < jets.length; i++) {
      if (jets[i] != null) {
        double maxValue = jets[i].getSpeed();
        double maxValue2 = 0;
        if (maxValue2 < maxValue) {
          maxValue2 = maxValue;
        }
        System.out.println(maxValue2);
      }
    }

  }

  // display stats of a selected aircraft
  public static void planeStatsMenu() {
    Scanner input = new Scanner(System.in);
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();
    System.out.println("Select an available Jet to see its stats.");
    // run through array for fleet selection
    for (int i = 0; i < jets.length; i++) {
      if (jets[i] != null) {
        System.out.println(i + 1 + ": " + jets[i].getModel());
      }
    }
    // select jet with method, accounting for 0->1 for selections
    int fleetSelection = input.nextInt();
    selectPlane(fleetSelection - 1, jets);

  }

  // fly the jets method
  public static void flyTheJets() {
    Scanner input = new Scanner(System.in);
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();
    System.out.println("Select an available Jet to see it fly!");
    for (int i = 0; i < jets.length; i++) {
      if (jets[i] != null) {
        System.out.println(i + 1 + ": " + jets[i].getModel());
      }
    }
    // select jet with method, accounting for 0->1 for selections
    int fleetSelection = input.nextInt();
    selectPlaneToFly(fleetSelection - 1, jets);

  }

  public static void selectPlane(int selection, Jet[] jetsArry) {
    jetsArry[selection].getPlaneStats();
  }

  public static void selectPlaneToFly(int selection, Jet[] jetsArry) {
    jetsArry[selection].fly();
  }

}
