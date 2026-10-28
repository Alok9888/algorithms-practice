class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_text = re.sub(r'[^a-zA-Z0-9\s]', '', s).lower().split()
        compressed = ''.join(clean_text)
        return compressed == compressed[::-1]
        


