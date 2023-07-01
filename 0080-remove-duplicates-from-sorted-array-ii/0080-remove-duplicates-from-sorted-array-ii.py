class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        reader=writer=0
        count=0
        for reader in range(0,len(nums)):
            if nums[reader]==nums[reader-1]:
                count +=1
            else:
                count=1
            if count <=2:
                nums[writer]=nums[reader]
                writer+=1
        return writer

        








# r=w=1
#         count=1
#         for r in range(1,len(nums)):
#             if nums[r]==nums[r-1]:
#                 count+=1
#             else:
#                 count=1
            
#             if count<=2:
#                 nums[w]=nums[r]
#                 w+=1

#         return w
