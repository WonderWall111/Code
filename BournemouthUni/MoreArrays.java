/**
 * MoreArrays class
 * This class contains tasks about using arrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
import java.io.Console;
import java.util.Arrays;

public class MoreArrays {


    //Task 1 - Display the array
    public String displayArray(String[] names) {
        String newNames = "";
        for (String name : names) {
            newNames = newNames + name + " ";
        }
        return newNames;
    }


    //Task 2 - Sort the array and display it again
	public String sortArray(String[] names) {
        Arrays.sort(names);
        String newNames = "";
        for (String name : names) {
            newNames = newNames + name + " ";
        }
        return newNames;
	}


    // Task 3 - Search array for specific name
	public int searchArray(String[] names, String check) {
        int result = 0;
        boolean found = false;
        for (int i = 0; i < names.length ; i++) {
            if (names[i].compareToIgnoreCase(check) == 0) {
                result = i;
                found = true;
            }
        }
        if (found != true) {
            result = -1;
        }
        return result;
	}
}