class Solution{
    static String reciprocalString(String S){
        // code here
        String str="";
        for(int i=0;i<S.length();i++){
            if(Character.isUpperCase(S.charAt(i))){
                str+=(char)('Z'-S.charAt(i)+'A');
            }
            else if(Character.isLowerCase(S.charAt(i))){
                str+=(char)('z'-S.charAt(i)+'a');
            }
            else{
                str+=S.charAt(i);
            }
        }
        return str;
    }
}
