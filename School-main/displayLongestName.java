class GFG {
    String longest(String names[], int n) {
        String longName="";
        int max=0;
        for(int i=0;i<n;i++){
            if(names[i].length()>max){
                max=names[i].length();
                longName=names[i];
            }
        }
        return longName;
    }
}
