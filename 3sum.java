/*
3Sum

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105

https://leetcode.com/problems/3sum/description/

*/
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        // Ordenamos el array para facilitar la eliminación de duplicados
        Arrays.sort(nums);

        // Usamos tres punteros para encontrar combinaciones únicas de tres elementos
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int suma = nums[i] + nums[left] + nums[right];
                if (suma == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right])); // Agregamos ordenado
                    left++;
                    right--;
                } else if (suma < 0) {
                    left++;  // Si la suma es menor a 0, aumentamos el valor izquierdo
                } else {
                    right--; // Si la suma es mayor a 0, reducimos el valor derecho
                }
            }
        }

        return new ArrayList<>(set);
    }
}