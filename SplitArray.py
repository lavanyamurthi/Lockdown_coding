//Python Program to Split the array and add the first part to the end There is a given an array and split it from a specified position
//and move the first part of array add to the end. 
def splitArr(arr, n, k): 
    for i in range(0, k): 
        x = arr[0]
        for j in range(0, n-1):
            arr[j] = arr[j + 1]
         
        arr[n-1] = x
         
 
# main
arr = [12, 10, 5, 6, 52, 36]
n = len(arr)
position = 2
 
splitArr(arr, n, position)
 
for i in range(0, n): 
    print(arr[i], end = ' ')
