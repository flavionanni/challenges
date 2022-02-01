import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        
        
        
        if(s.contains("AM")) {
            
            String[] newFormat = s.split(":");
            
            
            
            if(newFormat[0].equals("12")) {
                
                return String.join(":", "00", newFormat[1], newFormat[2].replace("AM", ""));
                
            } else {
                
                return s.replace("AM", "");
            }
            
            
        } else {
            
            String[] newFormat = s.split(":");
            
            if(newFormat[0].equals("12")) {
                
                return String.join(":", newFormat).replace("PM", "");
                
            } else {
                    
                int convertHours = Integer.parseInt(newFormat[0]) + 12;
            
                return String.join(":", Integer.toString(convertHours), newFormat[1],                       newFormat[2].replace("PM", ""));
                    
                        
            }
            
            
        }
                
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

