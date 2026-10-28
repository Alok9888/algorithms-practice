class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        n = len(nums)
        if(n == 0):
            return 0
        nums.sort()
        length = 1
        currLength = 1
        currElement = nums[0]
        for num in nums:
            if num - currElement == 1:
                currLength+=1
                currElement = num
            elif num - currElement > 1:
                currLength = 1
                currElement = num
            length = max(length, currLength)
        return length
        

