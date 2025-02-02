/*
 
An amazon fulfillment associate has a set of items that need to be packed into two boxes. 
Given an integer array of item weights (arr) to be packed, divide the item weights into two subsets A and B, 
for packing into the associated boxes, while repecting the following contitions: 
1.- The intersection of A and B is null, 
2.- the union A and B is equal to the original array, 
3.- The number of elements in subset A is minimal, 
4.- The sum of A's weights is greater than the sum of B's weights. 

return the subset A in increasing order where the sum of A's weights is greater than the sum of B's weights. 
If more than one subset A exists, return the one with the maximal total weight

 */
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
     * Complete the 'minimalHeaviestSetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
        
        int sumA = 0;
        int sumB = 0;
        for(int a : arr){
            sumB += a;
        }
        System.out.println(sumB+" total");
        List<Integer> resultado = new ArrayList<>();
        
        
        for(int a : arr){
            sumA += a;
            resultado.add(a);
            if(sumA > sumB-sumA){
                break;
            }
        }
        Collections.sort(resultado);
        return resultado;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.minimalHeaviestSetA(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
