package org.example.solution;

public class Solution453 {
  private static Solution453 solution453;

  public static Solution453 getInstant() {
    if (solution453 == null) {
      solution453 = new Solution453();
    }
    return solution453;
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
