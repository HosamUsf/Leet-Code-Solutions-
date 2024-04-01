class Solution {
    public int mySqrt(int x) {
    long r = x;

  while (r * r > x){

      r = (r + x / r) / 2;
    }
    // if (r * r != x) --squareroot;
    return (int) r ;
    }
}