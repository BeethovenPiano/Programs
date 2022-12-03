class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        int minDiff=a.get(m-1)-a.get(0);
        for(int i=1;i<=n-m;i++){
            minDiff=Math.min(minDiff,a.get(i+m-1)-a.get(i));
        }
        return minDiff;
    }
}
