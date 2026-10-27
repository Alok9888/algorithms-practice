class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        for item in nums:
            freq[item] = freq.get(item, 0) + 1
        freq = sorted(freq, key = lambda x:freq[x], reverse=True)
        return list(freq[:k])