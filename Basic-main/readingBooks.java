
class Solution{
    static long maxPoint(int N, long K, long A[], long B[])
    {
        // code here
        long max_points=0;
        for(int i=0;i<N;i++){
            long points=(K/A[i])*B[i];
              if(max_points<points){
                max_points=points;
            }
        }
        return max_points;
    }
}
