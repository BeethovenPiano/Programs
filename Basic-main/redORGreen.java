class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int redCount=0;
        int greenCount=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='R'){
                redCount++;
            }
            else{
                greenCount++;
            }
        }
        return Math.min(redCount,greenCount);
    }
}
