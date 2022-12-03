class Solution 
{ 
    String convert(String s) 
    { 
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                sb.append((char)('z'-s.charAt(i)+'a'));
            }
            else{
                sb.append((char)('Z'-s.charAt(i)+'A'));
            }
        }
        return sb.toString();
    }
} 





// String convert(String s){ 
//        StringBuilder str=new StringBuilder();
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
//                str.append((char)('z'-(s.charAt(i)-'a')));
//            }else{
//                str.append((char)('Z'-(s.charAt(i)-'A')));
//            }
//        }
//        return str.toString();
