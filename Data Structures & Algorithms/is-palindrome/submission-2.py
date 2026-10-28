class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_text = re.sub(r'[^a-zA-z0-9]', '', s).lower()
        return clean_text == clean_text[::-1]