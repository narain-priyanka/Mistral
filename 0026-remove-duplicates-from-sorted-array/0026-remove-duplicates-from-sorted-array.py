class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        reader=0
        writer=0
        while(reader != len(nums)):
            if(nums[reader]==nums[writer]):
                reader+=1
            else:
                nums[writer+1]=nums[reader]
                writer+=1
        return writer+1