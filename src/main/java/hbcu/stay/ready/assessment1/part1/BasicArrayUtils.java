package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        String [] secondElement = new String[stringArray.length];




        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] reverseArray = new String[stringArray.length];
        int reverseArrayIndex = 0;
        for (int arrayIndex = stringArray.length - 1; arrayIndex >= 0; arrayIndex--){
        reverseArray[reverseArrayIndex] = stringArray[arrayIndex];
        reverseArrayIndex++;
    }
    return reverseArray;
}


    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}
