/*Write a program that sets up a String variable containing a paragraph of text of your choice.
        a. Extract the words from the text and sort them into alphabetical order.
        b. Display the sorted list of words.
*/

package com.stackroute;

import java.util.*;


public class Sorting {
    public String[] sorting(String string){
        if(string.length()==0){
            return null;
        }
        else
        {
            string=string.toLowerCase();
            String[] str=string.split(" ");
            Arrays.sort(str);
            return  str;
        }
    }
}
