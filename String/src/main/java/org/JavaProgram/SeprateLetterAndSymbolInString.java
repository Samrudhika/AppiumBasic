package org.JavaProgram;

public class SeprateLetterAndSymbolInString {
    public static void main(String[]args)
    {
        String s="s@m!12t";
        String letter="";
        String symbol="";

        for (char s1:s.toCharArray()) {
            if(Character.isLetter(s1))
                letter+=s1;
            else if (Character.isDigit(s1)|| !Character.isWhitespace(s1))
                symbol+=s1;
        }
        System.out.println("Letter: " +letter);
        System.out.println("Symbols: " +symbol);

    }
}
