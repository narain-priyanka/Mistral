class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        def merge_sort(nums):
            if(len(nums)<=1):
                return nums
            k=len(nums)//2
            right = merge_sort(nums[k:])
            left = merge_sort(nums[:k])
            return merge(left,right)

        def merge(left,right):
            i=j=0
            s_merge=[]
            while(i<len(left) and j<len(right)):
                if(left[i]>right[j]):
                    s_merge.append(right[j])
                    j+=1
                else:
                    s_merge.append(left[i])
                    i += 1
            s_merge += left[i:]
            s_merge += right[j:]
            return s_merge
        s_merge = merge_sort(nums)
        hash_count={}
        count=w=0
        r=0
        while (r!=len(s_merge)):
            if(s_merge[r]==s_merge[w]):
                r+=1
                count+=1
                hash_count[s_merge[w]]=count
            else:
                count=0
                w=r
        for element in hash_count:
            if hash_count[element]>=len(nums)/2:
                return(element)
                




        

           
        
            