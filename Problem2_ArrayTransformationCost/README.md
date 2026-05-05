# Problem 2: Array Transformation Cost Minimization

## Problem

You can add or subtract K from any element. Find minimum operations to make all elements equal.

## Approach

* Check same remainder modulo K
* Convert values by dividing by K
* Find median
* Calculate total operations

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
