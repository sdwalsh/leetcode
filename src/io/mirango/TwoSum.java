package io.mirango;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // store numbers previously seen and indices
        HashMap<Integer, Integer> cs = new HashMap<>();

        for(int x = 0; x < nums.length; x++) {
            if (cs.containsKey(target - nums[x])) {
                return new int[]{cs.get(target - nums[x]), x};
            }
            cs.put(nums[x], x);
        }
        return new int[]{0, 0};
    }
}
