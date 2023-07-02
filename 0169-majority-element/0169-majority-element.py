class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hash_counts = {}
        max_count = 0
        # majority_element = None

        for num in nums:
            if num in hash_counts:
                hash_counts[num] += 1
            else:
                hash_counts[num] = 1
        for num in hash_counts:
            if hash_counts[num]>=len(nums)/2:
                return(num)








