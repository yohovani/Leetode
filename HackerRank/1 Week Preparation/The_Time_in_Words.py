#Given the time in numerals we may convert it into words, as shown below:
#
#At , use o' clock. For , use past, and for  use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.
#
#Function Description
#
#Complete the timeInWords function in the editor below.
#
#timeInWords has the following parameter(s):
#
#int h: the hour of the day
#int m: the minutes after the hour
#Returns
#
#string: a time string as described
#Input Format
#
#The first line contains , the hours portion The second line contains , the minutes portion
#
#Constraints
#
#Sample Input 0
#
#5
#47
#Sample Output 0
#
#thirteen minutes to six
#Sample Input 1
#
#3
#00
#Sample Output 1
#
#three o' clock
#Sample Input 2
#
#7
#15
#Sample Output 2
#
#quarter past seven

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeInWords' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. INTEGER h
#  2. INTEGER m
#

def timeInWords(h, m):
    # Write your code here
    minutes = ["o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter","sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one" , "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"]
    hours = ["","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"]
    
    if m == 0:
        return hours[h]+" "+minutes[m]
    if m > 0 and m <= 30:
        if m == 1:
            return minutes[m]+" minute past "+hours[h]
        elif m == 15 or m == 30:
            return minutes[m]+" past "+hours[h]
        else:
            return minutes[m]+" minutes past "+hours[h]
    if m > 30:
        minuto = 60 - m
        if minuto == 1:
            return minutes[minuto]+" minute to  "+hours[h+1]
        elif minuto == 15:
            return minutes[minuto]+" to "+hours[h+1]
        else:
            return minutes[minuto]+" minutes to "+hours[h+1]
    return ""
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    h = int(input().strip())

    m = int(input().strip())

    result = timeInWords(h, m)

    fptr.write(result + '\n')

    fptr.close()
