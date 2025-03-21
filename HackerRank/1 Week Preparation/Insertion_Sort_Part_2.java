/**
 * In Insertion Sort Part 1, you inserted one element into an array at its correct sorted position. Using the same approach repeatedly, can you sort an entire array?

Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an array with just the first element, it is already sorted since there's nothing to compare it to.

In this challenge, print the array after each iteration of the insertion sort, i.e., whenever the next element has been inserted at its correct position. Since the array composed of just the first element is already sorted, begin printing after placing the second element.

Example.



Working from left to right, we get the following output:

3 4 7 5 6 2 1
3 4 7 5 6 2 1
3 4 5 7 6 2 1
3 4 5 6 7 2 1
2 3 4 5 6 7 1
1 2 3 4 5 6 7
Function Description

Complete the insertionSort2 function in the editor below.

insertionSort2 has the following parameter(s):

int n: the length of 
int arr[n]: an array of integers
Prints

At each iteration, print the array as space-separated integers on its own line.

Input Format

The first line contains an integer, , the size of .
The next line contains  space-separated integers .

Constraints



Output Format

Print the entire array on a new line at every iteration.

Sample Input

STDIN           Function
-----           --------
6               n = 6
1 4 3 5 6 2     arr = [1, 4, 3, 5, 6, 2]
Sample Output

1 4 3 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 3 4 5 6 2 
1 2 3 4 5 6 
Explanation

Skip testing  against itself at position . It is sorted.
Test position  against position : , no more to check, no change.
Print 
Test position  against positions  and :

, new position may be . Keep checking.
, so insert  at position  and move others to the right.
Print 
Test position  against positions  (as necessary): no change.
Print 
Test position  against positions : no change.
Print 
Test position  against positions , insert  at position  and move others to the right.
Print 
 */

import java.util.*;

public class Insertion_Sort_Part_2 {
   /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */
    public static void print_arr(List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println("");
    }
    
    public static void insertionSort2(int n, List<Integer> arr) {
    // Write your code here
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr.get(i) < arr.get(j)){
                    arr.add(j,arr.get(i));
                    arr.remove(i+1);
                }
            }
            print_arr(arr);
        }
    }    
}
