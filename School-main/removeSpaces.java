class Solution
{
   
    String modify(String S)
    {
        // your code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(Character.isAlphabetic(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
