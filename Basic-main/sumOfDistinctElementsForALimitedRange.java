class Solution
{
    long sumOfDistinct(long arr[], int N)
    {  
        HashSet<Long> hs=new HashSet<>();
        for(Long ele:arr){
            hs.add(ele);
        }
        long sum=0;
        for(long e:hs){
            sum=sum+e;
        }
        return sum;
    }
}
