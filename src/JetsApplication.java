import java.util.Scanner;

public class JetsApplication {
  private static AirField airField = new AirField();

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
    System.out.println("3. Add a jet to the Aiport.");
    System.out.println("4. Display the fastest jet in the Airport.");
    System.out.println("5. Diplay the jet with the furthest range.");
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
        System.out.println("Enter a make for the aircraft:");
        String model = input.next();
        System.out.println("Enter speed:");
        double speed = input.nextDouble();
        System.out.println("Enter Range:");
        int range = input.nextInt();
        System.out.println("Price the aircraft:");
        long price = input.nextLong();
        Jet j = new JetImpl(model, speed, range, price);
        airField.addJet(j);
        mainMenu();

        // addJet();
      } else if (menuSelection.equals("4")) {
        Jet tempJet = AirField.getFastestPlane();
        System.out.println(tempJet.getModel() + " is the fastest Jet with a speed of " + tempJet.getSpeed());
        mainMenu();

      } else if (menuSelection.equals("5")) {
        Jet tempJet = AirField.getLongestDistance();
        System.out.println(tempJet.getModel() + " has a distance of " + tempJet.getRange()
            + " which is the furtherst of the airplanes available.");
        mainMenu();

      }

      else if (menuSelection.equals("0")) {
        System.out.println("Have a great day!");
        System.exit(0);

        // repeat menu if user provides invalid input
      } else {
        System.out.println("1. List available planes in the Airport.");
        System.out.println("2. Fly a Jet!");
        System.out.println("3. Add a jet to the Aiport.");
        System.out.println("4. Display the fastest jet in the Airport.");
        System.out.println("5. Diplay the jet with the furthest range.");
        System.out.println("0. Exit the Skill Distillery Airport.");
        menuSelection = input.next();
      }
    }

  }

  // display stats of a selected aircraft
  public static void planeStatsMenu() {
    Scanner input = new Scanner(System.in);
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
