class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String comb=S1+S2;
        String res="";
        for(int i=comb.length()-1;i>=0;i--){
            res+=comb.charAt(i);
        }
        return res;
    }
}
