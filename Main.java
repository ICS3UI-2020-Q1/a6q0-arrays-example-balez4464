import java.util.Scanner;
/**
 *This is an example for arrays
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //constant for number of marks
    final int NUM_MARKS = 5;

    //creates an array with 5 spots
    double[] grades = new double[NUM_MARKS];

    //put grades into array using loop
    for (int i = 0; i < grades.length; i++){
      System.out.println("Please enter in grade " + (i+1));
      grades[i] = input.nextDouble();
    }
    //create a variable to store a sum
    double sum = 0;

    //use a for loop to go through the array and add sum
    for(int i = 0; i < grades.length; i++){
      //add the grade to sum
      sum = sum + grades[i];
    }

    //determine the average
    double average = sum / NUM_MARKS;

    //let the user know
    System.out.println("Your average grade is " + average);

    

  }
}
