package org.JavaProgram;

import javax.swing.*;

public class PalindromeString {

    public static void main(String[] args) {


    String s =  "A man, a plan, a canal, Panama!";

    if(palfunction(s))
            System.out.println("String is palindrom");
    else
            System.out.println("String is not palindrom");
}
    private static boolean palfunction(String s)
    {
        int left=0;
        int right=s.length()-1;

        while(left<right)
        {
            if(left<right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            if(left<right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;

        }
            return true;

    }

}

