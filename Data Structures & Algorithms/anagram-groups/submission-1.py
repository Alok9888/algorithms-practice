class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = {}
        for char in strs:
            sortedWord = ''.join(sorted(char))
            group[sortedWord] = group.get(sortedWord, []) + [char]
        return list(group.values())
            
            