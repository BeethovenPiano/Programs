
class Solution {
    void rearrangeArray(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        int ar[]=new int[n];
        int smallIndex=0;
        int largeIndex=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ar[i]=arr[smallIndex];
                smallIndex++;
            }
            else{
                ar[i]=arr[largeIndex];
                largeIndex--;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=ar[i];
        }
    }
}
