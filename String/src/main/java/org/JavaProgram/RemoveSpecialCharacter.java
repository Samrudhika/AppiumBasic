package org.JavaProgram;

public class RemoveSpecialCharacter {
    public static void main(String[]args)
    {
        String s="abc!$ty";

        String news=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("string is :" +news);

    }
}
