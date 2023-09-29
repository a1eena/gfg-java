//Search an Element in an array
//Given an integer array and another integer element. The task is to find if the given element is present in array or not.
class Solution
{
       
    static int search(int arr[], int N, int X)
    {
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<N; i++)
        
        {
            if(arr[i]==X)
            {
            return (i);
            }
         }
         return -1;
    }
    
}