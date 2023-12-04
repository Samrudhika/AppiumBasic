package org.JavaProgram;

public class StringSwap {
    public static void main(String[] args) {
        String a = "xyz";
        String b = "pqr";

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap using concatenation
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
