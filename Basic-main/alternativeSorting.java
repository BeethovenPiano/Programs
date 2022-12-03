class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
        
        // Your code goes here
       ArrayList<Long> ar=new ArrayList<>();
       Arrays.sort(arr);
       int start=0;
       int end=N-1;
       while(start<=end){
            ar.add(arr[end]);
            ar.add(arr[start]);
            start++;
            end--;
       }
       return ar;
    }
}
