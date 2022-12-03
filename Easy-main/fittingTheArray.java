
class Solution{
    
   
    // Function for finding maximum and value pair
    public static boolean isFit (int arr[], int brr[], int n) {
        //Complete the function
        boolean flag=true;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if(arr[i]!=brr[i] && arr[i]>brr[i]){
                flag=false;
            }
        }
        return flag;
    }
    
}
