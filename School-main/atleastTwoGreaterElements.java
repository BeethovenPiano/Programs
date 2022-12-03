class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
        long[] exceptTwoLargeElements=new long[a.length-2];
        Arrays.sort(a);
        for(int i=0;i<n-2;i++){
            exceptTwoLargeElements[i]=a[i];
        }
        return exceptTwoLargeElements;
    }
}
