#!/bin/python3

import math
import os
import random
import re
import sys
import itertools

#
# Complete the 'maxMin' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER k
#  2. INTEGER_ARRAY arr
#

def maxMin(k, arr):
    # Write your code here
    permutations = list(itertools.permutations(arr,k))
    
    permutations = set(permutations)
    permutations = list(permutations)
    aux_list = list(permutations[0])
    aux_list.sort(reverse=True)
    minimo = aux_list[0]-aux_list[k-1]
    
    for i in range(1,len(permutations)):
        aux_list = list(permutations[i])
        aux_list.sort(reverse=True)
        
        aux = aux_list[0]-aux_list[k-1]

        if aux < minimo:
#            print(str(aux_list)+" - > "+str(aux_list[0])+" - "+str(aux_list[k-1]))#
            minimo = aux
            
    return minimo
    
k = 8
arr = [6327, 571, 6599, 479, 7897, 9322, 4518, 571, 6677, 7432, 815, 6920, 4329, 4104, 7775, 5708, 7991, 5802, 8619, 6053, 7539, 7454, 9000, 3267, 6343, 7165, 4095, 439, 5621, 4095, 153, 1948, 1018, 6752, 8779, 5267, 2426, 9649, 2190, 9103, 7081, 3006, 2376, 7762, 3462, 151, 3471, 1453, 2305, 8442]
maxMin(k, arr)