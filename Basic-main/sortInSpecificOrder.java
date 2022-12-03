class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        long ar[]=new long[arr.length];
        Arrays.sort(arr);
        int k=arr.length-1;
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2==0){
                ar[k--]=arr[i];
            }
            else{
                ar[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=ar[i];
        }
    }
}
