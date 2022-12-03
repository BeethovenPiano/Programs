class Solution {
    String removeCharacters(String S) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                sb.append((char)(S.charAt(i)));
            }
        }
        return sb.toString();
    }
}
