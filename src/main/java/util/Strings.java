package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String utility class
 * @author ericp
 * @version 1.0
 * @since 6/28/19 2:26 PM
 */
public class Strings {
    public static final String Empty = "";

    /**
    * Judges whether input param String is null or empty.
    * @author ericp
    * @param inputStr input string to be checked null or empty
    * @return boolean
    * @since 8:00 PM 7/2/19
    */
    public static boolean isNullOrEmpty(String inputStr) {
        if (inputStr == null || inputStr.length() == 0) return true;

        return false;
    }

    /**
    * Judges whether input param String is consistent of digit number(negative number will return true).
    * @author ericp
    * @param inputStr input string to be checked digit or not
    * @return boolean
    * @since 8:01 PM 7/2/19
    */
    public static boolean isDigit(String inputStr) {
        if (isNullOrEmpty(inputStr)) {
            return false;
        }
        Pattern pattern = Pattern.compile("[-1]?[0-9]*");
        Matcher isNum = pattern.matcher(inputStr);

        if (isNum.matches()) return true;

        return false;
    }

    /**
    * Pad a String from left reach to specified length with filling char '0'
    * @author ericp
    * @param inputStr input string to be format
    * @param length length to be pad
    * @return java.lang.String
    * @since 8:02 PM 7/2/19
    */
    public static String padLeft(String inputStr, int length) {
        return padLeft(inputStr, length, '0');
    }

    /**
    * Pad a String from left reach to specified length with filling char
    * @author ericp
    * @param inputStr  input string to be format
    * @param length length to be pad
    * @param fillChar char to be filled with in pad
    * @return java.lang.String
    * @since 8:03 PM 7/2/19
    */
    public static String padLeft(String inputStr, int length, char fillChar) {
        String rvStr;
        String suffix = "";

        //Zero length
        if (0 == length) return inputStr;

        if (isNullOrEmpty(inputStr)) {
            for (int i = 0; i < length; i++) {
                suffix += fillChar;
            }
            rvStr = suffix;
        } else {
            //if input string length bigger than demand length, return directly.
            if (inputStr.length() >= length) {
                rvStr = inputStr;
            } else {
                int cnt = length - inputStr.length();
                for (int a = 0; a < cnt; a++) {
                    suffix += fillChar;
                }

                rvStr = suffix + inputStr;
            }
        }
        return rvStr;
    }
}
