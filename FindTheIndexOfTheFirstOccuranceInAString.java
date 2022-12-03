class Solution {
    public int strStr(String haystack, String needle) {
        // Check if the needle is empty or longer than the haystack
    if (needle.length() == 0 || haystack.length() < needle.length()) {
        return -1;
    }
        // Iterate over the haystack and compare each substring of the same length as the needle with the needle
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
        String substring = haystack.substring(i, i + needle.length());
        if (substring.equals(needle)) {
            return i;
        }
    }

    // If the loop completes without finding a match, return -1
    return -1;
    }
}
