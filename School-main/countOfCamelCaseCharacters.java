class Sol
{
    int countCamelCase (String s)
    {
        // your code here  
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
