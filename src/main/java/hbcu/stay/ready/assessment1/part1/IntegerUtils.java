package hbcu.stay.ready.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        return null;
    }

    public static Integer reverseDigits(Integer val) {

        String number = Integer.toString();

        String reverseDigit;

        for(int i = number.length()-1; i >= 0; i--) {

            reverseDigit += number.charAt(i);
        }
        return Integer.parseInt(reverseDigit);

    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
       boolean a = val % 2 == 0;

       if (a){
           return true;
    }
        return false;
    }


          }