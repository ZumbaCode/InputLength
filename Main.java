import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in); 
    
    String name = null;

    System.out.println("Enter Your Name? ");

    if (scanner.toString() != "0") {
      name = scanner.nextLine();
      String inputName = name.substring(0, name.length() - 1);
      System.out.println("Hello ".toUpperCase() + inputName.toUpperCase());
    }
  }
}
