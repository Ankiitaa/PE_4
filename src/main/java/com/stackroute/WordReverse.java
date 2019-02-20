/*Write a program to transpose the given string.
        Input String : a quick brown fox jumps over the lazy dog
        Output String: a kciuq nworb xof spmuj revo eht yzal god
*/


package com.stackroute;
import java.lang.String;

public class WordReverse {
    public String wordReverse(String string){
        String temp="";
        if(string.length()==0){
            return null;
        }
        else
        {
            string=string.toLowerCase();
            String[] str=string.split(" ");
            for(int i=0;i<str.length;i++)
            {
                StringBuffer sbf = new StringBuffer(str[i]);
                temp+=sbf.reverse()+" ";
            }
            temp=temp.trim();
            return temp;
        }
    }
}
