/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False

 */





package com.stackroute;
import java.util.regex.*;

public class NamePresence {
    public boolean namePresence(String string){
        string=string.toLowerCase();
       String pattern="(harry)+";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(string);


        if(m.find()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
