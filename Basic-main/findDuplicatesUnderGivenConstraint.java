class Compute {
    
    public int findDuplicate(int A[])
    {
        // Your code goes here
        for(int i=0;i<A.length;i++){
            if(A[i]==A[i+1]){
                return A[i];
            }
        }
        return -1;
    }
}
