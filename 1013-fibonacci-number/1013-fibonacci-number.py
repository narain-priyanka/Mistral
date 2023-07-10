class Solution:
    def fib(self, n: int) -> int:
        memo=[0]*(n+2)
        memo[1]=1
        if memo[n]:
            return memo[n]
        for i in range(2,n+1):
            memo[i]=memo[i-1]+memo[i-2]
        return memo[n]
  