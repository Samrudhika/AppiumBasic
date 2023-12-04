package org.JavaProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {
    public static void main(String[]args)
    {
        String s1="listern";
        String s2="silent";

        if(isAnagram(s1,s2))
            System.out.println("String is Anagram");
        else
            System.out.println("String is not Anagram");

    }
    private static boolean isAnagram(String s1,String s2)
    {
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();

        if (s1.length()!= s2.length())
        return false;

        char[] s1Array=s1.toCharArray();
        char[] s2Array=s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array,s2Array);
    }

}
