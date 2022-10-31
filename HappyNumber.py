class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()
        while (n not in seen):
            seen.add(n)
            new = 0
            for ele in str(n):
                new += int(ele) ** 2
                
            
            if new == 1: return True
            n = new
        return False
