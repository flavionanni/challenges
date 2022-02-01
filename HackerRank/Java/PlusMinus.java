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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
        int positiveNumbers = 0, negativeNumbers = 0, zeros = 0;
        
        for(int num : arr) {
            if(num < 0) {
                negativeNumbers++;
            } else if(num > 0) {
                positiveNumbers++;
            } else {
                zeros++;
            }
        }
        
        double proportionPositive = positiveNumbers/(double) arr.size();
        double proportionNegative = negativeNumbers/(double) arr.size();
        double proportionZeros = zeros/(double) arr.size();
        
        System.out.printf("%.6f\n%.6f\n%.6f", proportionPositive, proportionNegative, proportionZeros);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

