class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        
        List<String> res=new ArrayList<>();
        
        for(int i=0;i<S.length();i++){
            if(Character.isUpperCase(S.charAt(i))||Character.isLowerCase(S.charAt(i))){
                sb1.append(S.charAt(i));
            }
            else if(Character.isDigit(S.charAt(i))){
                sb2.append(S.charAt(i));
            }
            else{
                sb3.append(S.charAt(i));
            }
        }
        res.add(sb1.length()==0?"-1":sb1.toString());
        res.add(sb2.length()==0?"-1":sb2.toString());
        res.add(sb3.length()==0?"-1":sb3.toString());
        return res;
    }
} 
