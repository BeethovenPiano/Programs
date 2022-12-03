class Solution {

    public static void Rearrange(int a[], int n, int answer[])
    {
        int indexSmall=0;
        int indexLarge=n-1;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
        if(i%2==0){
            answer[i]=a[indexSmall];
            indexSmall++;
        }
        else{
            answer[i]=a[indexLarge];
            indexLarge--;
        }
        }
    }
}
