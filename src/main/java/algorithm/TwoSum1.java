package algorithm;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int[] rs = new int[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {

                    rs[0] = i;
                    rs[1] = j;
                    System.out.print(i + "" + j);
                    break;

                }
            }
        }
        return rs;
    }


    public static void main(String[] args) {
        TwoSum1 twoSum1 = new TwoSum1();
        int[] numbers = {3, 2, 4};
        twoSum1.twoSum(numbers, 6);


    }
}
