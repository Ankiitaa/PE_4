/*Write a java program to count the total number of occurrences of a given character in a string
        without using any loop?
        For Example- Java is java again java again count number of occurrence of a in the given string
*/


package com.stackroute;

public class Occurence {
    public int occurence(String string, char character)
    {
        //converting character into string
        String charString=Character.toString(character);

        //convert charcter into lowercase
        charString=charString.toLowerCase();

        //convert the string to lower case
        string=string.toLowerCase();

        //calculate length of string
        int length=string.length();

        //calculate length of string after replacing given character with null
        int subLength=(string.replace(charString,"")).length();


        int finalResult=length-subLength;
        return finalResult;
    }
}
