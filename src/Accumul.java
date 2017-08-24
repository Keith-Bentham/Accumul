/**
 * codewars.com question
 * Created by Keith Bentham.
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 */

public class Accumul {
    public static String accum(String s) {
        StringBuilder sBuilder = new StringBuilder(); //using a stringBuilder as we want to create mutable strings
        int dash = 0; //create a dash variable
        for (char value : s.toCharArray()) { //for every character value in String s(convert string to char array) do the following
            if (dash > 0) {
                sBuilder.append('-');// if our dash value is greater than 0 we put a '-' between char
            }
            sBuilder.append(Character.toUpperCase(value));// append each value to upper case
            for (int j = 0; j < dash; j++) {// while j is less than dash increment j until value reached
                sBuilder.append(Character.toLowerCase(value));// append a lower case value each time onto the string
            }
            dash++; //increment dash
        }
        return sBuilder.toString(); //return sBuilder from char array to completed string again.
    }
}
