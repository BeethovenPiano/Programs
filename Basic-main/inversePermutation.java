class Complete{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> inversePermutation (int arr[], int n) {
        //Complete the function
        ArrayList<Integer> ar=new ArrayList<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[arr[i]-1]=i+1;
        }
        for(int i=0;i<n;i++){
            ar.add(a[i]);
        }
        return ar;
    }  
}
