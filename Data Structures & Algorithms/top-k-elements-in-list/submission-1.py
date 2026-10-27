class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        result = []
        for element in nums:
            freq[element] = freq.get(element, 0) + 1;
        freq = sorted(freq, key=lambda x : freq[x], reverse=True)
        return list(freq[:k])