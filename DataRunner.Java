/* 
*Create the scanner class
* the Scanner class takes the user's input
*/
import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
  
// Creating the object that contains the text files
    UserStory Diseases = new UserStory("Names.txt", "Symptom_1.txt", "Symptom_2.txt");

// Prints requirement for user input in the console
  System.out.println("Enter a disease name:");
   
  //taking user input
    String chosen = input.nextLine();
    Diseases.checkSpecificDisease(chosen);

// close the scanner
    input.close();
  }
}
