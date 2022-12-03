class Solution {
    String removeVowels(String S) {
        // code here
        StringBuilder str=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='a'&& S.charAt(i)!='e'&& S.charAt(i)!='i'&& S.charAt(i)!='o' && S.charAt(i)!='u'){
                str.append(S.charAt(i));
            }
        }
        return str.toString();
    }
}
