class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        boolean flag=false;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[n-i-1];
        }
        if(Arrays.equals(a,b)){
            flag=true;
        }
        return flag;
    }
    
}
