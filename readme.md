# Bubble Sort Excercise

Create a “BubbleSort” class with one public method called “sort” (You can create other private methods) which has to sort numbers in accordance with the “Bubble sort” algorithm. method should receive List of Comparable (parameter name = “input”) method should return List of Comparable, but the numbers should be sorted ascending if the input is null then method should throw an exception if the input contains null value in list then method should omit this element Create a “BubbleSortTest” class and create test methods for below cases: input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8] input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9] input = [] result = [] input = [null,5.0001] result = [5.0001] input = null result = RuntimeException 