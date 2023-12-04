package org.JavaProgram;

public class OccurenceOfDigit {
    public static void main(String[] args)
    {
        int count=0;
        for (int i=1;i<=100;i++)
        {
            String var=Integer.toString(i);
            if(var.contains("7"))
                count++;
        }
        System.out.println("Occurence of 7 is" +count);
    }
}
