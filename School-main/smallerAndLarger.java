
class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int[] ar=new int[n];
        int lowCount=0;
        int highCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                lowCount=lowCount+1;
            }
            else if(arr[i]>x){
                highCount=highCount+1;
            }
            else if(arr[i]==x){
                 lowCount=lowCount+1;
                 highCount=highCount+1;
            }
        }
        ar[0]=lowCount;
        ar[1]=highCount;
        return ar;
    }
}
