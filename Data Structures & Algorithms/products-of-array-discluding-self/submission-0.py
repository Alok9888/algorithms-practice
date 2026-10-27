class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        postfix = [1] * n
        prefix = [1] * n
        product=1
        postProduct=1
        for i in range(0, n):
            product *= nums[i]
            postProduct *= nums[(n-i)-1]
            prefix[i] = product
            postfix[(n-i)-1] = postProduct
        for i in range(0, n):
            if i==0:
                nums[i] = postfix[i+1]
            elif i==n-1:
                nums[i] = prefix[i-1]
            else:
                nums[i] = postfix[i+1]*prefix[i-1]
        return nums
