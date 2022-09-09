class Solution {
  public int mySqrt(long x) {
    long start = 1;
    long end = x + 1;

    while (start < end) {
      final long m = (start + end) / 2;
      if (m > x / m)
        end = m;
      else
        start = m + 1;
    }

    // l: smallest number s.t. l * l > x
    return (int) start - 1;
  }
}
