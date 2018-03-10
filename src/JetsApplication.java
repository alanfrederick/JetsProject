import java.util.Scanner;

public class JetsApplication {

  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    AirField airField = new AirField();
    Jet[] jets = airField.getJets();

    for (int i = 0; i < jets.length; i++) {
      System.out.println("Select an available Jet to see its stats.");
      System.out.println(jets[i].getModel());

      String jetSelection = input.next();
      
        
    }
    
    jets[0].fly();
    jets[1].fly();
    jets[2].fly();
    jets[3].fly();


  }

}
