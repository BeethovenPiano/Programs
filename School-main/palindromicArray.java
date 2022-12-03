class GfG
{
    public static boolean Palindrome(int n){
        int rem=0;
        int rev=0;
        int orginal=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==orginal){
            return true;
        }
        return false;
    }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for(int i=0;i<n;i++){
                      if(Palindrome(a[i])==false){
                          return 0;
                      }
                  }
                  return 1;
           }
}
