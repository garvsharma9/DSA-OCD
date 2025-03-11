class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        count={'a':-1, 'b':-1, 'c':-1}
        res = 0
        for i in range(len(s)):
            count[s[i]] = i
            if min(count.values()) > -1:
                res += min(count.values()) + 1
        
        return res
