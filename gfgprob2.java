//Binary Search
//Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search
class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
    
int beg=0;
        int end=n-1;
        int mid;
        int f=0;
        for(int i=0;i<n;i++)
     
        
        {
            while(beg<=end)
            {
            mid = (beg+end)/2;
            if(k==arr[mid])
            {
              return mid;
            }
            else
            if(k>arr[mid])
                beg = mid+1;
            else 
                 end = mid-1;
           }
     }
        
        
        return -1;
}
}
