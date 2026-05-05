# Problem 2: Array Transformation Cost Minimization

## Problem

Given an array, you can increase or decrease elements by K. Find minimum operations to make all elements equal.

## Approach

* Check if all elements have same remainder modulo K
* Convert array to A[i]/K
* Find median
* Sum absolute differences

## Complexity

* Time: O(n log n)
* Space: O(n)

## Example

Input:
5
2 4 6 8 10
2

Output:
6
