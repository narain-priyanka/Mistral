class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i=count=0
        j=len(nums)-1
        while(i!=j):
            if len(nums) == 0:
                return 0
            if (nums[i] == val and nums[j] != val):
                nums[i], nums[j] = nums[j], nums[i]
            elif(nums[i]!=val):
                i+=1
            elif(nums[j]==val):
                j=j-1
        for i in range(0,len(nums)):
            if(nums[i]!=val):
                count+=1
        return count