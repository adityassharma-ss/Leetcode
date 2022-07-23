class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0, curr = 0, dir[][] = {{0, 1}, {1, 0}, {0, -1}, { -1, 0}};
        for (int i = 0; i < instructions.length(); ++i)
            if (instructions.charAt(i) == 'R')
                curr = (curr + 1) % 4;
            else if (instructions.charAt(i) == 'L')
                curr = (curr + 3) % 4;
            else {
                x += dir[curr][0]; y += dir[curr][1];
            }
        return x == 0 && y == 0 || curr > 0;
    }
}
