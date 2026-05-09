class Solution:
    def validDigit(self, n, x):
        s = str(n)
        c = str(x)
        for i in range(len(s)):
            if c == s[i]:
                if i == 0:
                    return False
                    
                return True
        
        return False
