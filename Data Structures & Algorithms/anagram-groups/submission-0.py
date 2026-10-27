class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = defaultdict(list)
        for str in strs:
            dict_key = "".join(sorted(str))
            groups[dict_key].append(str)
        return list(groups.values())
        