class Solution {
    
    public long leftElement(long arr[], long n)
    {
        // Your code goes here  
        int elementLeft=0;
        long low=0;
        long high=n;
        int mid=(int)(low+high)/2;
        Arrays.sort(arr);
        if(n%2!=0){
            elementLeft=(int)arr[mid];
        }
        else{
            elementLeft=(int)arr[mid-1];
        }
        return elementLeft;
        
    }
}
