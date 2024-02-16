package org.example.l453;

public class Solution {
  private static Solution solution;

  public static Solution getInstant() {
    if (solution == null) {
      solution = new Solution();
    }
    return solution;
  }

  public int minMoves(int[] nums) {
    int min = nums[0];
    int counts = 0;
    for (int num : nums) {
      min = Math.min(num, min);
      counts = counts + num;
    }
    return counts - min * nums.length;
  }

}
