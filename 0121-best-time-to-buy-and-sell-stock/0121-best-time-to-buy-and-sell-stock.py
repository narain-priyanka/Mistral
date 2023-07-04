class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # lowest_buy=1
        # i=0
        # while(i!=len(prices) and lowest_buy>prices[i]):
        #         lowest_buy=prices[i]
        #         i+=1

        # for i in range(0,len(prices)):

        
        min_price = float('inf')
        max_profit = 0
        for i in range(len(prices)):
            if prices[i] < min_price:
                min_price = prices[i]
            elif prices[i] - min_price > max_profit:
                max_profit = prices[i] - min_price
                
        return max_profit


            


                


               
                
        