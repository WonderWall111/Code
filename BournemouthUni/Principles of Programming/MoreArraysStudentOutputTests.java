/**
 * MoreArraysStudentOutputTests class
 * This class is used to Output the results from MoreArrays.
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class MoreArraysStudentOutputTests {

    public static void main(String[] args) {
        MoreArrays moreArrays = new MoreArrays();
        String[] names ={"Bob", "Fred", "Gabriella", "Mohammed", "Eric", "Xavier", "Albert", "Connor", "Kevin", "Laura"};

        //task 1
        System.out.println(moreArrays.displayArray(names));

        // task 2
        System.out.println(moreArrays.sortArray(names));

        //task 3
        String check1 = "Bob";
        int result1 = moreArrays.searchArray(names, check1);
        if (result1 == -1) {
            System.out.println(check1 + "does not exist.");
        } else {
            System.out.println(names[result1]);
        }
        String check2 = "Bill";
        int result2 = moreArrays.searchArray(names, check2);
        if (result2 == -1) {
            System.out.println(check2 + " does not exist in the array.");
        } else {
            System.out.println(names[result2]);
        }
    }
}
