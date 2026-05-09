public class Solution {
    public bool ValidDigit(int n, int x) {
        string s = n.ToString();
        char c = (char)('0' + x);
        for(int i = 0; i < s.Length; i++){
            if(s[i] == c){
                if(i == 0) return false;

                return true;
            }
        }

        return false;
    }
}
