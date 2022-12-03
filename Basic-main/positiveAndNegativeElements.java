
class Solution
{
    ArrayList<Long> arranged(long a[], int n)
    {
        ArrayList<Long> ar=new ArrayList<>();
        long arr[]=new long[n];
        int positive=0;
        int negative=1;;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                arr[positive]=a[i];
                positive=positive+2;
            }
            else{
                arr[negative]=a[i];
                negative=negative+2;
            }
        }
        for(long ele:arr){
            ar.add(ele);
        }
        return ar;
    }
}
