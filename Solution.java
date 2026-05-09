class Solution {
    public boolean validDigit(int n, int x) {
        String s = Integer.toString(n);
        char c = (char)('0' + x);
        boolean exists = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                if(i == 0){
                    return(false);
                }

                return(true);
            }
        }

        return(exists);
    }
}
