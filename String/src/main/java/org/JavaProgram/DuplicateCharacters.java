package org.JavaProgram;

public class DuplicateCharacters {

    public  static void main(String[ ] args){
        String s="automation";
        int count=0;
        char[] charArray=s.toCharArray();
        for(int i=0;i < charArray.length;i++)
        {
            if(charArray[i]!='\0')
            {
                for (int j=i+1;j<charArray.length;j++) {
                    if (charArray[i] == charArray[j]) {
                        charArray[j] = '\0';
                        System.out.println("Character " + charArray[i]);
                        break;
                    }
                }
            }
        }

    }


}
