class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        if len(nums)<=1:
            return nums
        n= len(nums)//2
        left = self.sortArray(nums[:n])
        right = self.sortArray(nums[n:])
        return self.merge(left,right)

    def merge(self,left_array,right_array):
        merge_array=[]
        i=j=0
        while(i < len(left_array) and j < len(right_array)):
            if left_array[i] > right_array[j]:
                merge_array.append(right_array[j])
                j+=1
            else:
                merge_array.append(left_array[i])
                i+=1
        merge_array+=right_array[j:]
        merge_array+=left_array[i:]
        return merge_array





        