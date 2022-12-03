class Solution{
    static String magicalString(String S){
        // code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            sb.append((char)('z'-S.charAt(i)+'a'));
        }
        return sb.toString();
    }
}
