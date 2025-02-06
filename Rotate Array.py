#Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
#
#Example 1:
#
#Input: nums = [1,2,3,4,5,6,7], k = 3
#Output: [5,6,7,1,2,3,4]
#Explanation:
#rotate 1 steps to the right: [7,1,2,3,4,5,6]
#rotate 2 steps to the right: [6,7,1,2,3,4,5]
#rotate 3 steps to the right: [5,6,7,1,2,3,4]
#Example 2:
#
#Input: nums = [-1,-100,3,99], k = 2
#Output: [3,99,-1,-100]
#Explanation: 
#rotate 1 steps to the right: [99,-1,-100,3]
#rotate 2 steps to the right: [3,99,-1,-100]
# 
#
#Constraints:
#
#1 <= nums.length <= 105
#-231 <= nums[i] <= 231 - 1
#0 <= k <= 105

from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) < 10:

            aux = nums
            x = len(aux)-1
            for i in range(k):
                temp = aux[x]

                aux2_ = aux[0:x]
                aux = []
                aux.append(temp)
                aux.extend(aux2_)
                
            for i in range(len(aux)):
                nums[i] = aux[i]
        else:
            aux = nums
            x = len(aux)-1
            aux2_ = nums[len(nums)-k:]
            aux = nums[:len(nums)-k]
            aux2_.extend(aux)
            nums.clear()
            nums.extend(aux2_)

        
        