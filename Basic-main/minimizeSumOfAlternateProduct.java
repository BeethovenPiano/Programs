class Compute {
    
    public long altProduct(long arr[], long n)
    {
        // Your code goes here 
        Arrays.sort(arr);
        long prod_sum=0;
        for(int i=0;i<arr.length/2;i++){
            prod_sum+=arr[i]*arr[arr.length-1-i];
        }
        return prod_sum;
    }
}
