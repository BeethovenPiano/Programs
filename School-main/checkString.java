class Sol
{
    Boolean check (String s)
    {
        // your code here  
        boolean contains=true;
        int first=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(first!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
