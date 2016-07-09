package leetcode;
/*
 * Reverse String
 * 
 * Write a function that takes a string as input and returns the string reversed.

	Example:
	Given s = "hello", return "olleh".
 */
public class Q344 {
    public String reverseString(String s) {
        StringBuilder revStr = new StringBuilder(s);
        revStr.reverse();
        return revStr.toString();        
    }
}
