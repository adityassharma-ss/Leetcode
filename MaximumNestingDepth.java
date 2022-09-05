// Q no. 1614

class Solution {
    public int maxDepth(String s) {
        int depth = 0, open =0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                open++;
            }
            if(ch==')'){
                open--;
            }
            depth=Math.max(depth,open);
        }
        return depth;
    }
}
