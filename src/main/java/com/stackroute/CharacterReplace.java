/* Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry

 */


package com.stackroute;

public class CharacterReplace {
    public String characterReplace(String string){
       if(string.length()==0){
           return null;
       }
       else
       {
           string=string.toLowerCase();
           String temp=string.replace('d', 'f');
           temp=temp.replace('l', 't');
           return  temp;
       }
    }
}
