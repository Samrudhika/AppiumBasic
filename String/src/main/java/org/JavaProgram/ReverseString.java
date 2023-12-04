package org.JavaProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args)
    {
        String s="sam",rev="";
        char ch;
        for(int i=0;i<s.length();i++){
         ch=s.charAt(i);
         rev=ch+rev;

        }
        System.out.print("Reverse String:"+rev);
        System.out.println("");
        System.out.print("Rev string by using char array :");

        char[] charray=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(charray[i]);
        }
        System.out.println("");

        StringBuffer stringBuffer=new StringBuffer(s);
        System.out.println("Reverse of string by inbuild : "+stringBuffer.reverse());

        StringBuilder stringBuilder=new StringBuilder(s);
        System.out.println("Rev by StringBuffer is: " +stringBuilder.reverse());

        /*List<String> list;
        list= Stream.of("one", "two", "three", "four", "one", "three", "one").collect(Collectors.toList());
        boolean e=false;
        int count=1;
        for(int i=0;i< list.size();i++)
        {
            for (int j=i+1;j< list.size();j++)
            {
                if(list.indexOf(i)==list.indexOf(j))
                {
                    e=true;
                    if(e==true)
                    {
                        System.out.println(list.get(i));
                    }
                    count++;

                }
                //System.out.println(list.get(i));
            }
        }*/

    }
}
