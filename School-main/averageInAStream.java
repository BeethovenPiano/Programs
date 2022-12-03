class Solution {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float[] ft=new float[n];
        float sum=0;
        float avg=0;
        for(int i=0;i<n;i++){
            sum=(float)(sum+arr[i]);
            avg=(float)(sum/(i+1));
            ft[i]=avg;
        }
        return ft;
    }
}
