class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long sum1=0;
        long sum2=0;
        long add=0;
        for(int i=0;i<n/2;i++){
            sum1=sum1+a[i];
            sum2=sum2+a[n/2+i];
        }
        add=Math.abs(sum1-sum2);
        return add;
    }
}
