package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName util.Strings
 * @Description String utility class
 * @Author ericp
 * @Date 6/28/19 2:26 PM
 * @Version 1.0
 **/
public class Strings {
    private static Logger logger = LoggerFactory.getLogger(Strings.class);

    public static final String Empty = "";

    /**
        * @Author ericp
        * @Description Judges whether input param String is null or empty.
        * @Date 2:54 PM 6/28/19
        * @Param [inputStr]
        * @return boolean
    **/
    public static boolean isNullOrEmpty(String inputStr) {
        if (inputStr == null || inputStr.length() == 0) return true;

        return false;
    }

    /**
        * @Author ericp
        * @Description Judges whether input param String is consistent of digit number(negative number will return true).
        * @Date 2:52 PM 6/28/19
        * @Param [inputStr]
        * @return boolean
    **/
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
        * @Author ericp
        * @Description Pad a String from left reach to specified length with filling char '0'
        * @Date 2:52 PM 6/28/19
        * @Param [inputStr, length]
        * @return java.lang.String
    **/
    public static String padLeft(String inputStr, int length) {
        return padLeft(inputStr, length, '0');
    }

    /**
        * @Author ericp
        * @Description Pad a String from left reach to specified length with filling char
        * @Date 2:52 PM 6/28/19
        * @Param [inputStr, length, fillChar]
        * @return java.lang.String
    **/
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
