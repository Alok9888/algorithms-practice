class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        seen = {}
        n = len(numbers)
        for i in range(0, n):
            required = target - numbers[i]
            if required in seen:
                return list([seen[required] + 1, i+1])
            seen[numbers[i]] = i
        return []