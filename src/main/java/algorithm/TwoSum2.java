package algorithm;

import java.util.HashMap;

public class TwoSum2 {
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int length = nums.length;
        int rs[] = new int[2];
        for (int i = 0; i < length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < length; i++) {
            int x = target - nums[i];
            if (hashMap.containsKey(x) && x!=nums[i]) {
                int j = hashMap.get(x);
                rs[0] = i;
                rs[1] = j;
                System.out.print(i+""+j);
                break;
            }
        }
        return rs;
    }


    public static void main(String[] args) {
        TwoSum2 twoSum = new TwoSum2();
        int[] numbers = {3, 2, 4};
        twoSum.twoSum2(numbers, 6);


    }
}


