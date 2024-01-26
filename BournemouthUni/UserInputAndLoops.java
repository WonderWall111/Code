/**
 * UserInputAndLoops class
 * This class is used to practise getting input from users and applying loops to solve problems.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class UserInputAndLoops {

    //Task 1 - Request and return the student's age.
	public int studentAge() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = keyboard.nextInt();
        return age;
	}

    //Task 2 - Request the student's first name and surname, returning as a single string.
	public String studentName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = keyboard.next();
        System.out.println("Please enter your surname: ");
        String surname = keyboard.next();
        return firstName + " " + surname;
	}

    //Task 3 - Request and return the full student details
	public String studentDetails() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = keyboard.next();
        System.out.println("Please enter your surname: ");
        String surname = keyboard.next();
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(keyboard.next());
        System.out.println("Please enter the length of your degree program in years: ");
        int degreeLength = Integer.parseInt(keyboard.next());
        System.out.println("Please enter your phone number: ");
        String phoneNumber = keyboard.next();
        System.out.println("Please enter your target starting salary: ");
        int targetSalary = Integer.parseInt(keyboard.next());
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.UK);
        String formattedTargetSalary = formatter.format(targetSalary);
        keyboard.close();
        return firstName + " " + surname + " will be " + (age + degreeLength) + " when they graduate.\nSalaries over " + formattedTargetSalary + " will be considered.\nTo contact " + firstName + " call " + phoneNumber + ".";
	}

    //Task 4 - Reading in Numbers and store in an array
	/*public String storeNumbers() {
	}*/

    //Task 5 - Read in 3 marks, store in an array and calculate the average.
	/*public ?? numberTotal(??) {
		??
	}*/

    //Task 6 - Read in 3 marks, store in an array and calculate the average.
	/* public ?? gradeAverage(??) {
		??
	}*/

    //Task 7 - calculate the square and cube of numbers 0 to value given by user
    // display the results in a table format
	/*public ?? squaresAndCubes(??) {
		??
	}*/
}