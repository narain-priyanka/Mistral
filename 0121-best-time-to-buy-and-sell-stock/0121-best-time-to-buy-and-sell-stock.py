class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lowest_buy=float('inf')
        max_profit=0
        for i in range(0, len(prices)):
            if (lowest_buy > prices[i]):
                lowest_buy = prices[i]
            elif prices[i] - lowest_buy > max_profit:
                max_profit =prices[i]-lowest_buy
        return max_profit