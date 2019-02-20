package com.stackroute;
import java.util.regex.*;
import java.util.regex.*;

public class MultipleOccurence {
    public String multipleOccurence(String string, String subString){
        String result="";

        if (string.length() == 0) {
            return null;
        }
        else {
            string = string.toLowerCase();
            Pattern pattern = Pattern.compile(subString);
            Matcher m = pattern.matcher(string);
            while (m.find()) {
                result += "Found at:" + m.start() + "-" + m.end() + " ";
            }
            return result.trim();
        }
    }
}
