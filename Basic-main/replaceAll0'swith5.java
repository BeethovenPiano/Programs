class GfG {
    int convertfive(int num) {
        // Your code here
        String s=Integer.toString(num);
        String zero_to_five=s.replace("0","5");
        int number=Integer.parseInt(zero_to_five);
        return number;
    }
}
