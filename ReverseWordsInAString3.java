class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int j = 0;
        char[] chars = s.toCharArray();
        while (j < chars.length) {
            while (j < chars.length && chars[j] != ' ') {
                j++;
            }
            reverse(chars, i, j - 1);
            i = j + 1;
            j = i;
        }
        return new String(chars);
    }
    
    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
    }
}
