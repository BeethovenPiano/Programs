class Solution {
    ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<S.length();i++){
            ar.add(S.substring(0,S.length()-i));
        }
        return ar;
    }
};
