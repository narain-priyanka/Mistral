class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counts = {}
        max_count = 0
        majority_element = None

        for num in nums:
            if num in counts:
                counts[num] += 1
            else:
                counts[num] = 1

            if counts[num] > max_count:
                max_count = counts[num]
                majority_element = num

        return majority_element



