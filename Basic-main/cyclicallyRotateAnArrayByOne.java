class Compute {
    
    public void rotate(int arr[], int n)
    {
        int a[]=new int[n];
        int index=1;
        for(int i=1;i<n;i++){
            a[index]=arr[i-1];
            index++;
        }
        a[0]=arr[n-1];
        for(int i=0;i<n;i++){
            arr[i]=a[i];
        }
    }
}
